package com.adaptris.tumblrviewer;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.*;
import retrofit.client.Response;

/**
 * Created by Sylwester on 2015-11-05.
 */
public class PostListFragment extends ListFragment {

    public static final String BLOG = "blog";
    public static final String URL = "http://api.tumblr.com";
    private ArrayAdapter<Post> adapter;

    public static PostListFragment newInstance(String blog) {
        PostListFragment postListFragment = new PostListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(BLOG, blog);
        postListFragment.setArguments(bundle);
        return postListFragment;
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        String blog = getArguments().getString(BLOG);


        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint(URL);
        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        TumblrService tumblrService = builder.build().create(TumblrService.class);
        tumblrService.getPosts(blog, new Callback<TumblrResponse>() {
            @Override
            public void success(TumblrResponse tumblrResponse, Response response) {
                adapter.addAll(tumblrResponse.getResponse().getPosts());

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });


    }


}

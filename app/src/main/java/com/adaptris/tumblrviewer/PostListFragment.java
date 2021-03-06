package com.adaptris.tumblrviewer;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

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

    interface Callback {
        void openBlog(String url);
    }

    private Callback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof Callback) {
            callback = (Callback) context;
        } else {
            throw new IllegalStateException("Implement callback!");
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof Callback) {
            callback = (Callback) activity;
        } else {
            throw new IllegalStateException("Implement callback!");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callback = null;
    }

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

        adapter = new ArrayAdapter<Post>(getActivity(), R.layout.post_item, R.id.postTextView) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view1 = super.getView(position, convertView, parent);
                ImageView imageView = (ImageView) view1.findViewById(R.id.postImageView);
                TextView textView = (TextView) view1.findViewById(R.id.postTextView);

                Post post = getItem(position);

                textView.setText(Html.fromHtml(post.getCaption()));

                List<Photo> photos = post.getPhotos();
                if (photos.size() > 0) {
                    Picasso.with(getActivity())
                            .load(photos.get(0).getAltSizes().get(0).getUrl())
                            .into(imageView);
                }

                return view1;

            }
        };

        String blog = getArguments().getString(BLOG);

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint(URL);
        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        TumblrService tumblrService = builder.build().create(TumblrService.class);
        tumblrService.getPosts(blog, new retrofit.Callback<TumblrResponse>() {
            @Override
            public void success(TumblrResponse tumblrResponse, Response response) {
                adapter.addAll(tumblrResponse.getResponse().getPosts());
                setListAdapter(adapter);

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });


    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        callback.openBlog(adapter.getItem(position).getLinkUrl());

    }
}

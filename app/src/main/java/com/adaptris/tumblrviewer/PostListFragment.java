package com.adaptris.tumblrviewer;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

/**
 * Created by Sylwester on 2015-11-05.
 */
public class PostListFragment extends ListFragment {

    public static final String BLOG = "blog";
    public static final String URL = "http://api.tumblr.com

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
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1));
        setEmptyText(getArguments().getString(BLOG));
    }


}

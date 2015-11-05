package com.adaptris.tumblrviewer;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PostFragment extends Fragment {

    public static final String URL = "url";

    public static PostFragment newInstance(String url) {
        PostFragment postFragment = new PostFragment();
        Bundle bundle = new Bundle();
        bundle.putString(URL, url);
        postFragment.setArguments(bundle);

        return postFragment;
    }

    public PostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String url = getArguments().getString(URL);
        ((WebView)view.findViewById(R.id.postWebView)).loadUrl(url);

    }
}

package com.adaptris.tumblrviewer;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Sylwester on 2015-11-05.
 */
public interface TumblrService {

    @GET("/v2/blog/{blog}.tumblr.com/posts?api_key=fD0HOvNDa2z10uyozPZNnjeb4fEFGVGm58zttH6cXSe4K0qC64&limit=20offset=0")
    void getPosts(@Path("blog") String blog, Callback<TumblrResponse> callback);
}

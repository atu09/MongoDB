package com.atirek.alm.mongodb;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Alm on 6/28/2016.
 */
public class PostArray {

    @SerializedName("post")
    private List<Post> postList;

    public List<Post> getPostList() {
        return postList;
    }
}

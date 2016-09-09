package com.atirek.alm.mongodb;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alm on 6/28/2016.
 */
public class Post {

    @SerializedName("_id")
    private String _id;

    @SerializedName("audio_url")
    private String audio_url;

    @SerializedName("category")
    private String category;

    @SerializedName("colorCode")
    private String colorCode;

    @SerializedName("language")
    private String language;

    @SerializedName("title")
    private String title;

    @SerializedName("duration")
    private String duration;

    @SerializedName("timeStamp")
    private String timeStamp;

    @SerializedName("userId")
    private String userId;

    @SerializedName("username")
    private String username;

    @SerializedName("type")
    private String type;

    @SerializedName("userImage")
    private String userImage;

    @SerializedName("comment")
    private String[] comment;

    @SerializedName("retweet")
    private String[] retweet;

    @SerializedName("like")
    private String[] like;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String[] getComment() {
        return comment;
    }

    public void setComment(String[] comment) {
        this.comment = comment;
    }

    public String[] getRetweet() {
        return retweet;
    }

    public void setRetweet(String[] retweet) {
        this.retweet = retweet;
    }

    public String[] getLike() {
        return like;
    }

    public void setLike(String[] like) {
        this.like = like;
    }
}

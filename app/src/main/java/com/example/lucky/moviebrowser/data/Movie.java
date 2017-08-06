package com.example.lucky.moviebrowser.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 8/6/2017.
 */

public class Movie implements Serializable{

    private String mTitle;

    @SerializedName("poster_path")
    private String mPoster;

    @SerializedName("rating")
    private String mRating;

    @SerializedName("year")
    private String mYear;

    public static final String TMDB_IMAGE_PATH = "http://image.tmdb.org/t/p/w500";

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getPoster() {
        return TMDB_IMAGE_PATH + mPoster;
    }

    public void setPoster(String poster) {
        this.mPoster = poster;
    }

    public String getRating() {
        return mRating;
    }

    public void setRating(String description) {
        this.mRating = description;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String backdrop) {
        this.mYear = backdrop;
    }

    public static class MovieResult {
        private List<Movie> results;

        public List<Movie> getResults() {
            return results;
        }
    }
}

package com.example.lucky.moviebrowser.data;

/**
 * Created on 8/6/2017.
 */

public class Movie {
    private String mTitle;
    private String mPoster;
    private String mRaiting;
    private String mYear;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getPoster() {
        return "http://t2.gstatic.com/images?q=tbn:ANd9GcQW3LbpT94mtUG1PZIIzJNxmFX399wr_NcvoppJ82k7z99Hx6in";
    }

    public void setPoster(String poster) {
        this.mPoster = poster;
    }

    public String getRaiting() {
        return mRaiting;
    }

    public void setRaiting(String description) {
        this.mRaiting = description;
    }

    public String getYear() {
        return mYear;
    }

    public void setYear(String backdrop) {
        this.mYear = backdrop;
    }
}

package com.example.lucky.moviebrowser.data;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created on 8/6/2017.
 */

public interface MoviesApiService {

    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}

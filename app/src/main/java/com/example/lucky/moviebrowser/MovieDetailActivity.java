package com.example.lucky.moviebrowser;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.lucky.moviebrowser.data.Movie;
import com.squareup.picasso.Picasso;

/**
 * Created on 8/6/2017.
 */

public class MovieDetailActivity extends AppCompatActivity{
    private ImageView mMovieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);
        mMovieView = (ImageView) findViewById(R.id.movie_view);
        Movie movie = (Movie) getIntent().getSerializableExtra(MainActivity.MOVIE);
        loadMovie(movie);
    }

    private void loadMovie(Movie movie){
        Picasso.with(this).load(Uri.parse(movie.getPoster())).into(mMovieView);
    }
}

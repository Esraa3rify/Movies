package com.example.movies.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.movies.R;
import com.example.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView movieNameTV;
    Button getMovieName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieNameTV=findViewById(R.id.movieNameTV);
        getMovieName=findViewById(R.id.getMoviesBtn);
        getMovieName.setOnClickListener(this);

    }

    public MovieModel getMovieFromDataBase(){

        return new MovieModel("Cruella","4-7-2001","Psychological",7);

    }

    public void getMovie(){
        movieNameTV.setText(getMovieFromDataBase().getName());
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.getMoviesBtn)
        {
            getMovie();
        }

    }
}
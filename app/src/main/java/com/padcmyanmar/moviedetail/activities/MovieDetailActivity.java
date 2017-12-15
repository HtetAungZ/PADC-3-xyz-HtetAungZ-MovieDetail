package com.padcmyanmar.moviedetail.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.padcmyanmar.moviedetail.R;

import adapters.MovieDetailsAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity {

    @BindView(R.id.rv_tralier)
    RecyclerView recyclerView;

    @BindView(R.id.toolbar_title)
    Toolbar toolbar;
    private MovieDetailsAdapter movieDetailsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);


        movieDetailsAdapter=new MovieDetailsAdapter();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(movieDetailsAdapter);






    }
}

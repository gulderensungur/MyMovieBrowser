package com.example.mymoviebrowser;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Movie movie = getIntent().getParcelableExtra("movie");

        FragmentTransaction  fts = getSupportFragmentManager().beginTransaction();
       fts.add(R.id.container, DetailsFragment.newInstance(movie));
       fts.commit();
    }
}
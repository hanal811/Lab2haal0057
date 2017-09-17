package com.example.hannes.lab2haal0057;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

/**
 * Created by Hannes on 2017-09-17.
 */

public class Activity3  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        GridView gridview = (GridView) findViewById(R.id.grid);
        gridview.setAdapter(new Imageadapter(this));

    }
}

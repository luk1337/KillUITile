package com.luk.killuitile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // publish my tile
        new Tile(this).publish();

        // kill this activity
        finish();
    }
}
package com.luk.killuitile;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cyanogenmod.app.CMStatusBarManager;
import cyanogenmod.app.CustomTile;

public class MainActivity extends AppCompatActivity {
    private static int CUSTOM_TILE_ID = 1337;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PublishTile();
    }

    private void PublishTile() {
        Intent intent = new Intent(this, TileReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent , 0);

        CustomTile mCustomTile = new CustomTile.Builder(this)
                .setOnClickIntent(pendingIntent)
                .setContentDescription("Generic content description")
                .setLabel("Kill UI")
                .shouldCollapsePanel(false)
                .setIcon(R.drawable.ic_launcher)
                .build();

        CMStatusBarManager.getInstance(this)
                .publishTile(CUSTOM_TILE_ID, mCustomTile);
    }
}
package com.luk.killuitile;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;

import cyanogenmod.app.CMStatusBarManager;
import cyanogenmod.app.CustomTile;

/**
 * Created by luk1337 on 10/12/15.
 */
public class ApplicationStart extends Application {
    private static int CUSTOM_TILE_ID = 1337;

    @Override
    public void onCreate() {
        super.onCreate();

        publishTile();
    }

    private void publishTile() {
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

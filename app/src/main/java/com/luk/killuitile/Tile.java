package com.luk.killuitile;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import cyanogenmod.app.CMStatusBarManager;
import cyanogenmod.app.CustomTile;

/**
 * Created by luk1337 on 10/12/15.
 */
public class Tile {
    private static int CUSTOM_TILE_ID = 1337;
    private Context mContext;

    public Tile(Context context) {
        mContext = context;
    }

    public void publish() {
        Intent intent = new Intent(mContext, TileReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(mContext, 0, intent , 0);

        CustomTile mCustomTile = new CustomTile.Builder(mContext)
                .setOnClickIntent(pendingIntent)
                .setContentDescription("Generic content description")
                .setLabel("Kill UI")
                .shouldCollapsePanel(false)
                .setIcon(R.drawable.ic_launcher)
                .build();

        CMStatusBarManager.getInstance(mContext)
                .publishTile(CUSTOM_TILE_ID, mCustomTile);
    }
}

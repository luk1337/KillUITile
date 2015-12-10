package com.luk.killuitile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.io.IOException;

/**
 * Created by luk1337 on 10/12/15.
 */
public class BootReceiver extends BroadcastReceiver {
    private static String TAG = "BootReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "onReceive");

        new Tile(context).publish();
    }
}

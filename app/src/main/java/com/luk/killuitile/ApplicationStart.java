package com.luk.killuitile;

import android.app.Application;

/**
 * Created by luk1337 on 10/12/15.
 */
public class ApplicationStart extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        publishTile();
    }

    private void publishTile() {
        new Tile(this).publish();
    }
}

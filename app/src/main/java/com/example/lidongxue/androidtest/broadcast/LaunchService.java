package com.example.lidongxue.androidtest.broadcast;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by lidongxue on 17-9-25.
 */

public class LaunchService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("service is binded");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("service is created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("service is startcommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("service is destroy");
    }
}

package com.example.lidongxue.androidtest.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by lidongxue on 17-9-25.
 */

public class LaunchReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent l_intent =new Intent(context,LaunchService.class);
        context.startService(l_intent);
    }
}

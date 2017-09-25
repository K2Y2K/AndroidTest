package com.example.lidongxue.androidtest.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by lidongxue on 17-9-25.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("-----tag-----","正接收广播发送");
        Toast.makeText(context,"接收到的action为："+
                intent.getAction()+"\n消息内容是："+intent.getStringExtra("msg"),
                Toast.LENGTH_SHORT).show();
    }
}

package com.example.lidongxue.androidtest.broadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.lidongxue.androidtest.R;

/**
 * Created by lidongxue on 17-9-25.
 */

public class BroadcastActivity extends Activity {
    Button send,startS,stopS;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_broadcast);
        send=findViewById(R.id.send);
        startS=findViewById(R.id.startS);
        stopS=findViewById(R.id.stopS);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent =new Intent("org.crazyit.action.CRAZY_BROADCAST");
                Intent intent =new Intent();
                intent.setAction("org.crazyit.action.CRAZY_BROADCAST");
                intent.putExtra("msg","收到请回复");
                sendBroadcast(intent);
                Log.d("-----tag-----","执行完广播发送");
            }
        });
        final Intent s_intent=new Intent(this,LaunchService.class);
        startS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(s_intent);
            }
        });
        stopS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(s_intent);
            }
        });

    }
}

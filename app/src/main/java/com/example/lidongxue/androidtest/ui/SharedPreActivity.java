package com.example.lidongxue.androidtest.ui;


import android.content.SharedPreferences;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lidongxue.androidtest.R;

import java.util.Date;

/**
 * Created by lidongxue on 17-9-22.
 */

public class SharedPreActivity extends AppCompatActivity{
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        preferences = getSharedPreferences("crazyit",MODE_PRIVATE);
        editor=preferences.edit();
        Button read= (Button) findViewById(R.id.read);
        Button write= (Button) findViewById(R.id.write);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time=preferences.getString("time",null);
                int randNum =preferences.getInt("random",0);
                String result =time==null?"您暂时还未写入数据":"写入时间为："+time+"\n上次生成的随机数为："+randNum;
                Toast.makeText(SharedPreActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日" + "hh:mm:ss");
                editor.putString("time",sdf.format(new Date()));
                //editor.putString("time","hhh");
                editor.putInt("random",(int)(Math.random()*100));
                editor.commit();
            }
        });
    }
}

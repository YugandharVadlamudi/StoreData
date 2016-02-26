package com.example.kiran.storedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Kiran on 16-11-2015.
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        TextView tv= (TextView) findViewById(R.id.tv);

        Intent i=getIntent();
        tv.setText(i.getStringExtra("Name"));

    }
}

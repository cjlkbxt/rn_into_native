package com.example.cjlkbxt.rn_into_native.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cjlkbxt.rn_into_native.R;


public class MainActivity extends AppCompatActivity {

    private TextView mTvGoRn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvGoRn = (TextView)findViewById(R.id.tv_go_rn);
        mTvGoRn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RnActivity.class);
                startActivity(intent);
            }
        });

    }
}

package com.clarifai.android.starter.api.v2.activity;

import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.clarifai.android.starter.api.v2.R;
public class Setting extends AppCompatActivity {

 Toolbar mToolbar;
 Button btnred,btngreen,btnpurple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        btnred = (Button) findViewById(R.id.button);
        btngreen = (Button) findViewById(R.id.button1);
        btnpurple = (Button) findViewById(R.id.button3);

        mToolbar.setTitle(getResources().getString(R.string.app_name));

        if (getColor() != getResources().getColor(R.color.colorPrimary)) {
            mToolbar.setBackgroundColor(getColor());
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setStatusBarColor(getColor());
            }
        }

        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.red));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.red));
                }
                storeColor(getResources().getColor(R.color.red));
            }
        });
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.Green));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.Green));
                }
                storeColor(getResources().getColor(R.color.Green));
            }
        });
        btnpurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.purple));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.purple));
                }
                storeColor(getResources().getColor(R.color.purple));
            }
        });
    }

    private void storeColor(int color){
        SharedPreferences mSharePreferences = getSharedPreferences("ToolbarColor",MODE_PRIVATE);
        SharedPreferences.Editor mEditor = mSharePreferences.edit();
        mEditor.putInt("color", color);
        mEditor.apply();
    }

    private int getColor() {
        SharedPreferences mSharePreferences = getSharedPreferences("ToolbarColor", MODE_PRIVATE);
        int selectedColor = mSharePreferences.getInt("color", getResources().getColor(R.color.colorPrimary));
        return selectedColor;
    }
}

package com.clarifai.android.starter.api.v2.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.clarifai.android.starter.api.v2.R;

public class MenuAcrivity extends AppCompatActivity {

    Button btnReg, btnHelp,btnSetting, btnExit;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_acrivity);

        btnReg = (Button) findViewById(R.id.button);
        btnHelp = (Button) findViewById(R.id.button3);
        btnSetting = (Button) findViewById(R.id.button6);
        btnExit = (Button) findViewById(R.id.button5);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mToolbar.setTitle(getResources().getString(R.string.app_name));

        if (getColor() != getResources().getColor(R.color.colorPrimary)) {
            mToolbar.setBackgroundColor(getColor());
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setStatusBarColor(getColor());
            }
        }

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte = new Intent(MenuAcrivity.this, RecognizeConceptsActivity.class);
                startActivity(inte);
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte2 = new Intent(MenuAcrivity.this, MenuHelp.class);
                startActivity(inte2);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte4 = new Intent(MenuAcrivity.this, Setting.class);
                startActivity(inte4);
            }
        });

    }

    private int getColor() {
        SharedPreferences mSharePreferences = getSharedPreferences("ToolbarColor", MODE_PRIVATE);
        int selectedColor = mSharePreferences.getInt("color",mToolbar.getDrawingCacheBackgroundColor());
        return selectedColor;
    }
}

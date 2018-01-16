package com.clarifai.android.starter.api.v2.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.clarifai.android.starter.api.v2.R;

public class MenuAcrivity extends AppCompatActivity {

    Button btnCapt, btnLoad, btnData, btnHelp, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_acrivity);

        btnCapt = (Button) findViewById(R.id.button);
        btnLoad = (Button) findViewById(R.id.button2);
        btnHelp = (Button) findViewById(R.id.button4);
        btnExit = (Button) findViewById(R.id.button5);

        btnLoad.setOnClickListener(new View.OnClickListener() {
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

        btnCapt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte3 = new Intent(MenuAcrivity.this, CameraActivity.class);
                startActivity(inte3);
            }
        });

    }


}

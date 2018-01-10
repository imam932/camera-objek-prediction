package com.clarifai.android.starter.api.v2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.clarifai.android.starter.api.v2.R;

public class MenuAcrivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_acrivity);
        Button ton1 = (Button) findViewById(R.id.button2);
        Button ton4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);

        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte = new Intent(MenuAcrivity.this, RecognizeConceptsActivity.class);
                startActivity(inte);
            }
        });

        ton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent inte2 = new Intent(MenuAcrivity.this, MenuHelp.class);
                startActivity(inte2);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });


    }
}

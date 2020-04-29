package com.example.regularpayments1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PopupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
        Button done=(Button)findViewById(R.id.button3);
        Button cncl = (Button)findViewById(R.id.button2);
        cncl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openactivity();
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();
            }
        });
    }

            public void openactivity(){
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
            }


}

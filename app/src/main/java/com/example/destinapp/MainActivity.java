package com.example.destinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mtrue_button;
    Button mfalse_button;
    TextView mbody_text;
    int n=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtrue_button = findViewById(R.id.true_button);
        mfalse_button = findViewById(R.id.false_button);
        mbody_text = findViewById(R.id.textbody);

        mtrue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(n==1 || n == 2){
                n=3;
                mbody_text.setText(R.string.T3_Story);
                mtrue_button.setText(R.string.T3_Ans1);
                mfalse_button.setText(R.string.T3_Ans2);
            }
            else if(n==3){
                mbody_text.setText(R.string.T6_End);
            }

            }
        });

        mfalse_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n == 3) {
                    mbody_text.setText(R.string.T5_End);
                } else if (n == 1) {
                    mbody_text.setText(R.string.T2_Story);
                    mtrue_button.setText(R.string.T2_Ans1);
                    mfalse_button.setText(R.string.T2_Ans2);
                } else if (n == 2) {
                    mbody_text.setText(R.string.T4_End);
                }
            }
        });}
    }

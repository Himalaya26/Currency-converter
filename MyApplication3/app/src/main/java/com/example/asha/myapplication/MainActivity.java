package com.example.asha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    double ans, a;
    int i = 1;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void clk(View view) {

        et1 = findViewById(R.id.et);
        if (et1.length() != 0) {
            a = Double.parseDouble(et1.getText().toString());

            if (i % 2 == 1) {
                ans = a * 63.84;
                Toast.makeText(getApplicationContext(), et1.getText().toString() + "$ = Rs" + ans, Toast.LENGTH_LONG).show();

            } else {
                ans = a * 0.016;
                Toast.makeText(getApplicationContext(), "Rs" + et1.getText().toString() + " = " + ans + "$", Toast.LENGTH_LONG).show();

            }
        }
    }

    public void press(View view) {

        iv1 = findViewById(R.id.iv);

        if (i % 2 == 1) {
            iv1.setImageResource(R.drawable.usd);
        } else {
            iv1.setImageResource(R.drawable.inr);
        }
        i++;
    }

}


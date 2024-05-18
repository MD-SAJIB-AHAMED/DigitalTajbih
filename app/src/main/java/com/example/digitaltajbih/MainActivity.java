package com.example.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView countdisplay;

    Button addbutton,subbutton,resetbutton;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdisplay=findViewById(R.id.countDisplay);
        addbutton=findViewById(R.id.addbutton);
        subbutton=findViewById(R.id.subbutton);
        resetbutton=findViewById(R.id.resetbutton);


        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                countdisplay.setText(""+count);
            }
        });

        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                countdisplay.setText(""+count);
            }
        });
        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                countdisplay.setText(""+count);
                Toast.makeText(MainActivity.this,"Reset",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
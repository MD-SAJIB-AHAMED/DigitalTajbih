package com.example.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splass_Screen extends AppCompatActivity {

    TextView textView,name;
    ImageView tasbihImage;
    Animation leftToRight,upfrombottom,zoomin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splass_screen_activity);

        textView = findViewById(R.id.textView);
        tasbihImage = findViewById(R.id.tasbihImage);
        name = findViewById(R.id.name);

        leftToRight = AnimationUtils.loadAnimation(Splass_Screen.this,R.anim.left_to_right);
        upfrombottom = AnimationUtils.loadAnimation(Splass_Screen.this,R.anim.up_from_bottom_slow);
        zoomin = AnimationUtils.loadAnimation(Splass_Screen.this,R.anim.zoom_in);

        Thread myThread = new Thread(){
            public void run(){
                try {
                    tasbihImage.startAnimation(zoomin);
                    textView.startAnimation(leftToRight);
                    name.startAnimation(upfrombottom);
                    sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent myIntent = new Intent(Splass_Screen.this,MainActivity.class);
                    startActivity(myIntent);
                    finish();
                }
            }
        };myThread.start();
    }
}
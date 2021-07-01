package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class ButtonAnimationActivity extends AppCompatActivity {


    private Button button,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_animation);


        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.milkshake);
        button = (Button) findViewById(R.id.btn);
        button.setAnimation(myAnim);


        final Animation myAnim2 = AnimationUtils.loadAnimation(this, R.anim.shake);
        button2 = (Button) findViewById(R.id.btn2);
        button2.setAnimation(myAnim2);


        final Animation myAnim3 = AnimationUtils.loadAnimation(this, R.anim.createshake);
        button3 = (Button) findViewById(R.id.btn3);
        button3.setAnimation(myAnim3);







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(myAnim);
            }
        });





        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(myAnim2);
            }
        });





        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setAnimation(myAnim3);
            }
        });








    }
}
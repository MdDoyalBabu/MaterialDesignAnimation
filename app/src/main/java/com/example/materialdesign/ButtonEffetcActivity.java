package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ButtonEffetcActivity extends AppCompatActivity {


    private Button btn1,btn2,btn3,btn4,btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_effetc);


        //findviewbyID
        Button helloWorld = findViewById(R.id.hello_world);

        btn1=findViewById(R.id.hello_world1);
        btn2=findViewById(R.id.hello_world2);
        btn3=findViewById(R.id.hello_world3);
        btn4=findViewById(R.id.hello_world4);
        btn5=findViewById(R.id.hello_world5);



        //Set button alpha to zero
        helloWorld.setAlpha(0f);

        //Animate the alpha value to 1f and set duration as 1.5 secs.
        helloWorld.animate().alpha(1f).setDuration(1500);

        //set rotate button

       // btn1.animate().rotation(120).setDuration(3000);

        // rotate axios

       // btn2.animate().rotationX(120).setDuration(3000);

        //scale button

        btn3.animate().scaleYBy(1).setDuration(3000);

        //set delay

        btn4.setAlpha(0f);
        btn4.setTranslationY(10);
        btn4.animate().alpha(1f).translationYBy(0).setStartDelay(100).setDuration(2500);


        //set action
      /*   btn5.animate().alpha(1f).translationYBy(-50).setStartDelay(200).withEndAction(new Runnable() {
            @Override
            public void run() {
                //End Action

                Toast.makeText(ButtonEffetcActivity.this, "Animating Button", Toast.LENGTH_SHORT).show();
            }
        }).setDuration(1500);


       */



    }
}
package com.example.tahas.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button anim;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim=(Button)findViewById(R.id.button);
        text=(TextView)findViewById(R.id.textView);

        anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation blickingAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
                text.startAnimation(blickingAnimation);
            }
        });
    }
}

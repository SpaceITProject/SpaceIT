package com.example.spaceit;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Word1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word1);
        final ImageView img_word1 = findViewById(R.id.word1);
        img_word1.setClipToOutline(true);
        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Word1.this, WordsLevel.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_next = findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Word1.this, Word2.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_variant1 = findViewById(R.id.variant1);
        button_variant1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_variant1.setBackgroundResource(R.drawable.style_button_incorrectly);
                }
                return false;
            }
        });
        Button button_variant2 = findViewById(R.id.variant2);
        button_variant2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_variant2.setBackgroundResource(R.drawable.style_button_right);
                }
                return false;
            }
        });
        Button button_variant3 = findViewById(R.id.variant3);
        button_variant3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_variant3.setBackgroundResource(R.drawable.style_button_incorrectly);
                }
                return false;
            }
        });
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Word1.this, WordsLevel.class);
            startActivity(intent);
            finish();
        }catch (Exception e){
        }
    }

}
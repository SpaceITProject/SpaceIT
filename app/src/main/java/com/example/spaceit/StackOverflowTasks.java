package com.example.spaceit;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StackOverflowTasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stackoverflow_task);
        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(StackOverflowTasks.this, TaskLevel.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_true1 = findViewById(R.id.button_true1);
        button_true1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_true1.setBackgroundResource(R.drawable.style_button_right);
                }
                return false;
            }
        });
        Button button_false1 = findViewById(R.id.button_false1);
        button_false1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_false1.setBackgroundResource(R.drawable.style_button_incorrectly);
                }
                return false;
            }
        });
        Button button_true2 = findViewById(R.id.button_true2);
        button_true2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_true2.setBackgroundResource(R.drawable.style_button_incorrectly);
                }
                return false;
            }
        });
        Button button_false2 = findViewById(R.id.button_false2);
        button_false2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_false2.setBackgroundResource(R.drawable.style_button_right);
                }
                return false;
            }
        });
        Button button_true3 = findViewById(R.id.button_true3);
        button_true3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_true3.setBackgroundResource(R.drawable.style_button_incorrectly);
                }
                return false;
            }
        });
        Button button_false3 = findViewById(R.id.button_false3);
        button_false3 .setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button_false3.setBackgroundResource(R.drawable.style_button_right);
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
            Intent intent = new Intent(StackOverflowTasks.this, TaskLevel.class);
            startActivity(intent);
            finish();
        }catch (Exception e){
        }
    }

}
package com.example.spaceit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_back = findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_theory = findViewById(R.id.buttonTheory);
        button_theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                 Intent intent = new Intent(GameLevels.this, TheoryLevel.class);
                 startActivity(intent);
                 finish();
                }catch (Exception e){
                }
            }
        });
        Button button_task = findViewById(R.id.buttonTask);
        button_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, TaskLevel.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception e){
        }
    }
}
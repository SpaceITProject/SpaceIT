package com.example.spaceit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TaskLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1_task);
        Button button_back = findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(TaskLevel.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_words = findViewById(R.id.buttonWordListTask);
        button_words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(TaskLevel.this, WordsLevel.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(TaskLevel.this, GameLevels.class);
            startActivity(intent);
            finish();
        }catch (Exception e){
        }
    }

}
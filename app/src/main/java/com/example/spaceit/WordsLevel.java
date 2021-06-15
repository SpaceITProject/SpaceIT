package com.example.spaceit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class WordsLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1_task_words);
        final ImageView img_word1 = findViewById(R.id.word1);
        img_word1.setClipToOutline(true);
        final ImageView img_word2 = findViewById(R.id.word2);
        img_word2.setClipToOutline(true);
        final ImageView img_word3 = findViewById(R.id.word3);
        img_word3.setClipToOutline(true);
        final ImageView img_word4 = findViewById(R.id.word4);
        img_word4.setClipToOutline(true);
        Button button_back = findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(WordsLevel.this, TaskLevel.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_word1 = findViewById(R.id.buttonWord1);
        button_word1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(WordsLevel.this, Word1.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){
                }
            }
        });
        Button button_word2 = findViewById(R.id.buttonWord2);
        button_word2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(WordsLevel.this, Word2.class);
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
            Intent intent = new Intent(WordsLevel.this, TaskLevel.class);
            startActivity(intent);
            finish();
        }catch (Exception e){
        }
    }

}
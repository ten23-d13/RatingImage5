package com.example.ratingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btnLike;
    ImageButton btnDislike;
    TextView textLike;
    TextView textDislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLike = findViewById(R.id.btnLike);
        btnDislike = findViewById(R.id.btnDislike);
        textLike = findViewById(R.id.textLike);
        textDislike = findViewById(R.id.textDislike);







    }

    public void like(View view) {
        if (textDislike.getVisibility() == View.VISIBLE){
            textDislike.setVisibility(View.INVISIBLE);

        }
        if (textLike.getVisibility() == View.VISIBLE){
            textLike.setVisibility(View.INVISIBLE);
        }else{
            textLike.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(),"Мне нравится!",Toast.LENGTH_SHORT).show();
        }

    }

    public void dislike(View view) {
        if (textLike.getVisibility() == View.VISIBLE){
            textLike.setVisibility(View.INVISIBLE);
        }
        if (textDislike.getVisibility() == View.VISIBLE){
            textDislike.setVisibility(View.INVISIBLE);

        }else{
            textDislike.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(),"Мне не нравится!",Toast.LENGTH_SHORT).show();
        }

    }
}
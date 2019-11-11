package com.example.galgelegs185033;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gameLost extends AppCompatActivity implements View.OnClickListener {

    TextView lostGame;
    Button tryAgain;
    ImageView lostGallow;

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_lost);

        lostGame = findViewById(R.id.lost);
        tryAgain = findViewById(R.id.tryAgain);
        lostGallow = findViewById(R.id.lostGallow);
    }


    public void onClick(View v) {
        if (R.id.tryAgain == v.getId()) {
            retryGame();
        }
    }

    public void retryGame () {
        Intent start = new Intent(this, createGame.class);
        startActivity(start);
    }
}

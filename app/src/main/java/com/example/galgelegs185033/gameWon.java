package com.example.galgelegs185033;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gameWon extends AppCompatActivity implements View.OnClickListener {

    TextView wonGame;
    Button tryAgain;
    ImageView wonGallow;

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_won);

        wonGame = findViewById(R.id.won);
        tryAgain = findViewById(R.id.tryAgain2);
        wonGallow = findViewById(R.id.actualWonGallow);

        wonGame.setText("Tilykke, du vandt, ordet var:\n" + createGame.ord);
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

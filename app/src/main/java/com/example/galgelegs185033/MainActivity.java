package com.example.galgelegs185033;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView welcome;
    TextView name;
    Button startGame;
    public static String playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        name = findViewById(R.id.name);
        welcome = findViewById(R.id.welcome);
        startGame = findViewById(R.id.startGame); startGame.setOnClickListener(this);
    }

    public void onClick (View v) {

        if(R.id.startGame == v.getId()) {
            playerName = name.getText().toString();
            openGame();
        }
    }

    public void openGame () {
        Intent start = new Intent(this, createGame.class);
        startActivity(start);
    }
}

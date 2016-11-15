package com.example.user.cardgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 15/11/2016.
 */

public class Pontoon extends AppCompatActivity {


    EditText mPlayerNamesText;
    Button mAddPlayers;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("Pontoon", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayerNamesText  = (EditText)findViewById(R.id.player_text);
        mAddPlayers = (Button)findViewById(R.id.players_button);

        mAddPlayers.setOnClickListener();

    }

}

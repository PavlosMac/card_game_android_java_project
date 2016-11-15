package com.example.user.cardgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class GameActivity extends AppCompatActivity {

    TextView mPlayers;
    TextView mGamePlay;
    Button mPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("Pontoon", "GameActivity onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mPlayers = (TextView)findViewById(R.id.player_names);


        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String names = extras.getString("names");

        String[] arr = names.split(" ");

        String player1 = arr[0];
        String player2 = arr[1];

        Game game = new Game();
        game.addPlayers(player1);
        game.addPlayers(player2);


        mPlayers.setText(names);
        mGamePlay = (TextView)findViewById(R.id.game_play);

        mPlay = (Button)findViewById(R.id.play);

        mPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("GameActivity", "Play button clicked");

                Deck deck = new Deck("Pontoon");
                game.deal(deck);


                mGamePlay = winner logic

            }
        });


    }


}

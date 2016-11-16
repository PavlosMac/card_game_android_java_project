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
            Button mReplay;

            Game game;
            Deck deck;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                Log.d("Pontoon", "GameActivity onCreate called");
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_game);

                mPlayers = (TextView) findViewById(R.id.player_names);
//
//
                Intent intent = getIntent();

                Bundle extras = intent.getExtras();

                String playerNames = extras.getString("names");

//
                mPlayers.setText(playerNames);

                String names = getIntent().getExtras().getString("names");
                String[] arr = names.split(" ");

                Player player1 = new Player(arr[0]);
                Player player2 = new Player(arr[1]);

                game = new Game();
                game.addPlayer(player1);
                game.addPlayer(player2);
//


                deck = new Deck("Pontoon");
//


                mGamePlay = (TextView) findViewById(R.id.game_play);

                mPlay = (Button) findViewById(R.id.play);


                mPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("GameActivity", "Play button clicked");

                        game.deal(deck);

                        String result = game.fullPlayAsString();

                        mGamePlay.setText(result);

                    }
                });

                    mReplay = (Button) findViewById(R.id.re_play);

                mReplay.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){

                        Log.d("GameActivity", "Replay button clicked");

                        game.reDeal(deck);

                        String results = game.fullPlayAsString();

                        mGamePlay.setText("");

                        mGamePlay.setText(results);


                    }

                });


            }


}

package com.example.peugebenjamin.kings;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Play extends AppCompatActivity {
<<<<<<< Updated upstream
    Deck gamecards;
    Cards pulled;
    TextView played;
=======
    TextView cardsplayed;
    Button playbutton;
    Deck gamecards;
    Cards carddrawn;

>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Button play = (Button) findViewById(R.id.btplay);
        played = (TextView) findViewById(R.id.played);

        gamecards = new Deck();

        cardsplayed = (TextView) findViewById(R.id.tvcardsplayed);
        playbutton = (Button) findViewById(R.id.btdraw);
        gamecards = new Deck();
    }
        public void Draw(){
            carddrawn = gamecards.drawCard();
            Toast callit = new Ta
    }



    public void playGame(View v){
        if (v.equals(played)) {
            pulled = gamecards.drawCard();
            Toast.makeText(getApplicationContext(), pulled.toString(), Toast.LENGTH_LONG).show();
            //played.setText(pulled.toString());
        }
    }
}

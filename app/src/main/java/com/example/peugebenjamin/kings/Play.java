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
    Deck gamecards;
    Cards pulled;
    TextView played;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Button play = (Button) findViewById(R.id.btplay);
        played = (TextView) findViewById(R.id.played);

       // gamecards = new Deck();

    }

    public void playGame(){

            //pulled = gamecards.drawCard();
            Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_LONG).show();
            //played.setText(pulled.toString());
    }
}

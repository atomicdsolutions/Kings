package com.example.peugebenjamin.kings;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;



public class Play extends AppCompatActivity implements View.OnClickListener {
    Button draw;
    Deck gamecards;
    Cards pulled;
    String msg;
    TextView playedcards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        playedcards = (TextView) findViewById(R.id.played);
        draw = (Button) findViewById(R.id.btplay);
        draw.setOnClickListener(this);
        gamecards = new Deck();
    }

    @Override
    public void onClick(View v) {
        pulled = gamecards.drawCard();
        if (pulled != null)
            msg = gamecards.drawCard().toString();
        else {
            msg = "Not a Value ";
        }
        Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
        playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
    }
}

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
            msg = "Not a  Value ";
        }
        switch (pulled.getValue()){
            case 0:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 1:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 2:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 3:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 4:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 5:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 6:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 7:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 8:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 9:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 10:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 11:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 12:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);
            case 13:
                Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_LONG).show();
                playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);

        }
       // playedcards.setText(msg.toCharArray(),0,msg.toCharArray().length);

    }
}

package com.example.marlowe.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {
    int counter = 0;

    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        b1 = (ImageButton) findViewById( R.id.imageButton1 );
        cardFlip( b1 );
        b2 = (ImageButton) findViewById( R.id.imageButton2 );
        cardFlip( b2 );
        b3 = (ImageButton) findViewById( R.id.imageButton3 );
        cardFlip( b3 );
        b4 = (ImageButton) findViewById( R.id.imageButton4 );
        cardFlip( b4 );
        b5 = (ImageButton) findViewById( R.id.imageButton5 );
        cardFlip( b5 );
        b6 = (ImageButton) findViewById( R.id.imageButton6 );
        cardFlip( b6 );
        b7 = (ImageButton) findViewById( R.id.imageButton7 );
        cardFlip( b7 );
        b8 = (ImageButton) findViewById( R.id.imageButton8 );
        cardFlip( b8 );
        b9 = (ImageButton) findViewById( R.id.imageButton9 );
        cardFlip( b9 );
        b10 = (ImageButton) findViewById( R.id.imageButton10 );
        cardFlip( b10 );
        b11 = (ImageButton) findViewById( R.id.imageButton11 );
        cardFlip( b11 );
        b12 = (ImageButton) findViewById( R.id.imageButton12 );
        cardFlip( b12 );
        b13 = (ImageButton) findViewById( R.id.imageButton13 );
        cardFlip( b13 );
        b14 = (ImageButton) findViewById( R.id.imageButton14 );
        cardFlip( b14 );
        b15 = (ImageButton) findViewById( R.id.imageButton15 );
        cardFlip( b15 );
        b16 = (ImageButton) findViewById( R.id.imageButton16 );
        cardFlip( b16 );
        b17 = (ImageButton) findViewById( R.id.imageButton17 );
        cardFlip( b17 );
        b18 = (ImageButton) findViewById( R.id.imageButton18 );
        cardFlip( b18 );
        b19 = (ImageButton) findViewById( R.id.imageButton19 );
        cardFlip( b19 );
        b20 = (ImageButton) findViewById( R.id.imageButton20 );
        cardFlip( b20 );

    }



    public void cardFlip( ImageButton b ) {
        final ImageButton temp = b;
        counter = 0;
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                //BAD
                counter++;
                if( counter % 2 == 1 ) {
                    temp.setBackgroundResource(R.drawable.nba_logo);
                } else {
                    temp.setBackgroundResource(R.drawable.nba_logo2);
                }
            }
        });
    }

}

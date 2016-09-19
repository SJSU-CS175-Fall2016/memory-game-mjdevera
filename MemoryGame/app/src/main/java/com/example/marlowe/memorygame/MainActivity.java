package com.example.marlowe.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mRulesbutton;
    private Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRulesbutton = (Button) findViewById( R.id.rules_button );
        mRulesbutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                //Start RulesActivity
                Intent i = new Intent( MainActivity.this, RulesActivity.class );
                startActivity( i );
            }
        });

        mPlayButton = (Button) findViewById( R.id.play_button );
        mPlayButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                //Start RulesActivity
                Intent i = new Intent( MainActivity.this, PlayActivity.class );
                startActivity( i );
            }
        });
    }
}

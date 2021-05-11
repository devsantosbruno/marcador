package com.example.scorer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marcador.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView soccer = (TextView) findViewById(R.id.soccer);
        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent soccerIntent = new Intent(MainActivity.this, SoccerActivity.class);
                startActivity(soccerIntent);
            }
        });

        TextView basketball = (TextView) findViewById(R.id.basketball);
        basketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basketballIntent = new Intent(MainActivity.this, BasketballActivity.class);
                startActivity(basketballIntent);
            }
        });

        TextView volleyball = (TextView) findViewById(R.id.volleyball);
        volleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volleyballIntent = new Intent(MainActivity.this, VolleyballActivity.class);
                startActivity(volleyballIntent);
            }
        });

        TextView tennis = (TextView) findViewById(R.id.tennis);
        tennis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent tennisIntent = new Intent(MainActivity.this, TennisActivity.class);
                startActivity(tennisIntent);
            }
        });

        TextView tableTennis = (TextView) findViewById(R.id.tableTennis);
        tableTennis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent tableTennisIntent = new Intent(MainActivity.this, TableTennisActivity.class);
                startActivity(tableTennisIntent);
            }
        });
    }
}
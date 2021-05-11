package com.example.scorer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marcador.R;

public class VolleyballActivity extends AppCompatActivity {

    //VARIAVEIS PARA TIME A
    int setsValueA = 0;
    int pointsValueA = 0;
    int foulsValueA = 0;

    //VARIAVEIS PARA TIME B
    int setsValueB = 0;
    int pointsValueB = 0;
    int foulsValueB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball);
    }

    //CONFIGURACOES PARA TIME A
    public void setsA(View v) {
        setsValueA = setsValueA + 1;
        displaySetsA(setsValueA);
    }

    public void pointsA(View v) {
        pointsValueA = pointsValueA + 1;
        displayPointsA(pointsValueA);
    }

    public void foulsA(View v) {
        foulsValueA = foulsValueA + 1;
        displayFoulsA(foulsValueA);
    }

    //CONFIGURACOES PARA TIME B
    public void setsB(View v) {
        setsValueB = setsValueB + 1;
        displaySetsB(setsValueB);
    }

    public void pointsB(View v) {
        pointsValueB = pointsValueB + 1;
        displayPointsB(pointsValueB);
    }

    public void foulsB(View v) {
        foulsValueB = foulsValueB + 1;
        displayFoulsB(foulsValueB);
    }

    //CRIANDO FUNCAO PARA RESETAR OS VALORES
    public void reset(View v) {
        setsValueA = 0;
        pointsValueA = 0;
        foulsValueA = 0;
        setsValueB = 0;
        pointsValueB = 0;
        foulsValueB = 0;
        displaySetsA(setsValueA);
        displayPointsA(pointsValueA);
        displayFoulsA(foulsValueA);
        displaySetsB(setsValueB);
        displayPointsB(pointsValueB);
        displayFoulsB(foulsValueB);
    }

    //TIME A
    public void displaySetsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.setsValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPointsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointsValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueA);
        scoreView.setText(String.valueOf(score));
    }

    //TIME B
    public void displaySetsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.setsValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPointsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointsValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueB);
        scoreView.setText(String.valueOf(score));
    }
}
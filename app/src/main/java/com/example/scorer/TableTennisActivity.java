package com.example.scorer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marcador.R;

public class TableTennisActivity extends AppCompatActivity {

    //VARIAVEIS PARA TIME A
    int setsValueA = 0;
    int pointsValueA = 0;
    int foulsValueA = 0;
    int obstructionValueA = 0;

    //VARIAVEIS PARA TIME B
    int setsValueB = 0;
    int pointsValueB = 0;
    int foulsValueB = 0;
    int obstructionValueB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabletennis);
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

    public void obstructionA(View v) {
        obstructionValueA = obstructionValueA + 1;
        displayObstructionA(obstructionValueA);
    }

    public void foulsA(View v) {
        foulsValueA = foulsValueA + 1;
        pointsValueB = pointsValueB + 1;
        displayFoulsA(foulsValueA);
        displayPointsB(pointsValueB);
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

    public void obstructionB(View v) {
        obstructionValueB = obstructionValueB + 1;
        displayObstructionB(obstructionValueB);
    }

    public void foulsB(View v) {
        foulsValueB = foulsValueB + 1;
        pointsValueA = pointsValueA + 1;
        displayFoulsB(foulsValueB);
        displayPointsA(pointsValueA);
    }

    //CRIANDO FUNCAO PARA RESETAR OS VALORES
    public void reset(View v) {
        setsValueA = 0;
        pointsValueA = 0;
        obstructionValueA = 0;
        foulsValueA = 0;
        setsValueB = 0;
        pointsValueB = 0;
        obstructionValueB = 0;
        foulsValueB = 0;
        displaySetsA(setsValueA);
        displayPointsA(pointsValueA);
        displayObstructionA(obstructionValueA);
        displayFoulsA(foulsValueA);
        displaySetsB(setsValueB);
        displayPointsB(pointsValueB);
        displayObstructionB(obstructionValueB);
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

    public void displayObstructionA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.obstructionValueA);
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

    public void displayObstructionB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.obstructionValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueB);
        scoreView.setText(String.valueOf(score));
    }
}

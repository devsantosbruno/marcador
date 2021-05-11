package com.example.scorer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marcador.R;

public class TennisActivity extends AppCompatActivity {

    //VARIAVEIS PARA TIME A
    int setsValueA = 0;
    int gamesValueA = 0;
    int pointsValueA = 0;
    int foulsValueA = 0;
    int warningsValueA = 0;
    int doubleValueA = 0;

    //VARIAVEIS PARA TIME B
    int setsValueB = 0;
    int gamesValueB = 0;
    int pointsValueB = 0;
    int foulsValueB = 0;
    int warningsValueB = 0;
    int doubleValueB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);
    }

    //CONFIGURACOES PARA TIME A
    public void setsA(View v) {
        setsValueA = setsValueA + 1;
        displaySetsA(setsValueA);
    }

    public void gamesA(View v) {
        gamesValueA = gamesValueA + 1;
        displayGamesA(gamesValueA);
    }

    public void pointsA(View v) {
        pointsValueA = pointsValueA + 1;
        displayPointsA(pointsValueA);
    }

    public void foulsA(View v) {
        foulsValueA = foulsValueA + 1;
        displayFoulsA(foulsValueA);
    }

    public void warningsA(View v) {
        warningsValueA = warningsValueA + 1;
        displayWarningsA(warningsValueA);
    }

    public void doubleFaultA(View v) {
        doubleValueA = doubleValueA + 1;
        pointsValueB = pointsValueB + 1;
        displayDoubleA(doubleValueA);
        displayPointsB(pointsValueB);
    }

    //CONFIGURACOES PARA TIME B
    public void setsB(View v) {
        setsValueB = setsValueB + 1;
        displaySetsB(setsValueB);
    }

    public void gamesB(View v) {
        gamesValueB = gamesValueB + 1;
        displayGamesB(gamesValueB);
    }

    public void pointsB(View v) {
        pointsValueB = pointsValueB + 1;
        displayPointsB(pointsValueB);
    }

    public void foulsB(View v) {
        foulsValueB = foulsValueB + 1;
        displayFoulsB(foulsValueB);
    }

    public void warningsB(View v) {
        warningsValueB = warningsValueB + 1;
        displayWarningsB(warningsValueB);
    }

    public void doubleFaultB(View v) {
        doubleValueB = doubleValueB + 1;
        pointsValueA = pointsValueA + 1;
        displayDoubleB(doubleValueB);
        displayPointsA(pointsValueA);
    }

    //CRIANDO FUNCAO PARA RESETAR OS VALORES
    public void reset(View v) {
        setsValueA = 0;
        gamesValueA = 0;
        pointsValueA = 0;
        foulsValueA = 0;
        doubleValueA = 0;
        setsValueB = 0;
        gamesValueB = 0;
        pointsValueB = 0;
        foulsValueB = 0;
        doubleValueB = 0;
        displaySetsA(setsValueA);
        displayGamesA(gamesValueA);
        displayPointsA(pointsValueA);
        displayFoulsA(foulsValueA);
        displayDoubleA(doubleValueA);
        displaySetsB(setsValueB);
        displayGamesB(gamesValueB);
        displayPointsB(pointsValueB);
        displayFoulsB(foulsValueB);
        displayDoubleB(doubleValueB);
    }

    //TIME A
    public void displaySetsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.setsValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGamesA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gamesValueA);
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

    public void displayWarningsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.warningsValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDoubleA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.doubleValueA);
        scoreView.setText(String.valueOf(score));
    }

    //TIME B
    public void displaySetsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.setsValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGamesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gamesValueB);
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

    public void displayWarningsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.warningsValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayDoubleB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.doubleValueB);
        scoreView.setText(String.valueOf(score));
    }
}

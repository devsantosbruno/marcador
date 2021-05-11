package com.example.scorer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marcador.R;

public class BasketballActivity extends AppCompatActivity {

    //VARIAVEIS PARA TIME A
    int scoreA = 0;
    int threeValueA = 0;
    int twoValueA = 0;
    int oneValueA = 0;
    int foulsValueA = 0;
    int freeValueA = 0;

    //VARIAVEIS PARA TIME B
    int scoreB = 0;
    int threeValueB = 0;
    int twoValueB = 0;
    int oneValueB = 0;
    int foulsValueB = 0;
    int freeValueB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
    }

    //CONFIGURACOES PARA TIME A
    public void threeA(View v) {
        threeValueA = threeValueA + 1;
        scoreA = scoreA + 3;
        displayThreeA(threeValueA);
        displayScoreA(scoreA);
    }

    public void twoA(View v) {
        twoValueA = twoValueA + 1;
        scoreA = scoreA + 2;
        displayTwoA(twoValueA);
        displayScoreA(scoreA);
    }

    public void oneA(View v) {
        oneValueA = oneValueA + 1;
        scoreA = scoreA + 1;
        displayOneA(oneValueA);
        displayScoreA(scoreA);
    }

    public void foulsA(View v) {
        foulsValueA = foulsValueA + 1;
        displayFoulsA(foulsValueA);
    }

    public void freeA(View v) {
        freeValueA = freeValueA + 1;
        displayFreeA(freeValueA);
    }

    //CONFIGURACOES PARA TIME B
    public void threeB(View v) {
        threeValueB = threeValueB + 1;
        scoreB = scoreB + 3;
        displayThreeB(threeValueB);
        displayScoreB(scoreB);
    }

    public void twoB(View v) {
        twoValueB = twoValueB + 1;
        scoreB = scoreB + 2;
        displayTwoB(twoValueB);
        displayScoreB(scoreB);
    }

    public void oneB(View v) {
        oneValueB = oneValueB + 1;
        scoreB = scoreB + 1;
        displayOneB(oneValueB);
        displayScoreB(scoreB);
    }

    public void foulsB(View v) {
        foulsValueB = foulsValueB + 1;
        displayFoulsB(foulsValueB);
    }

    public void freeB(View v) {
        freeValueB = freeValueB + 1;
        displayFreeB(freeValueB);
    }

    //CRIANDO FUNCAO PARA RESETAR OS VALORES
    public void reset(View v) {
        scoreA = 0;
        threeValueA = 0;
        twoValueA = 0;
        oneValueA = 0;
        foulsValueA = 0;
        freeValueA = 0;
        scoreB = 0;
        threeValueB = 0;
        twoValueB = 0;
        oneValueB = 0;
        foulsValueB = 0;
        freeValueB = 0;
        displayScoreA(scoreA);
        displayThreeA(threeValueA);
        displayTwoA(twoValueA);
        displayOneA(oneValueA);
        displayFoulsA(foulsValueA);
        displayFreeA(freeValueA);
        displayScoreB(scoreB);
        displayThreeB(threeValueB);
        displayTwoB(twoValueB);
        displayOneB(oneValueB);
        displayFoulsB(foulsValueB);
        displayFreeB(freeValueB);
    }

    //MOSTRAR CADA VALOR DO TIME A PARA O USUARIO
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayThreeA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.threeValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTwoA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.twoValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOneA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.oneValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFreeA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.freeValueA);
        scoreView.setText(String.valueOf(score));
    }

    //MOSTRAR CADA VALOR DO TIME A PARA O USUARIO
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayThreeB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.threeValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTwoB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.twoValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOneB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.oneValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFreeB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.freeValueB);
        scoreView.setText(String.valueOf(score));
    }
}

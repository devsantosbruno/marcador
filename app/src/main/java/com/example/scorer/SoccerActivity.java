package com.example.scorer;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marcador.R;

public class SoccerActivity extends AppCompatActivity {

    //VARIAVEIS PARA TIME A
    int goalValueA = 0;
    int penaltyValueA = 0;
    int cornerValueA = 0;
    int foulsValueA = 0;
    int yellowValueA = 0;
    int redValueA = 0;

    //VARIAVEIS PARA B
    int goalValueB = 0;
    int penaltyValueB = 0;
    int cornerValueB = 0;
    int foulsValueB = 0;
    int yellowValueB = 0;
    int redValueB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);
    }

    //CONFIGURACOES PARA TIME A
    public void goalA(View v) {
        goalValueA = goalValueA + 1;
        displayGoalA(goalValueA);
    }

    public void penaltyA(View v) {
        penaltyValueA = penaltyValueA + 1;
        displayPenaltyA(penaltyValueA);
    }

    public void cornerA(View v) {
        cornerValueA = cornerValueA + 1;
        displayCornerA(cornerValueA);
    }

    public void foulsA(View v) {
        foulsValueA = foulsValueA + 1;
        displayFoulsA(foulsValueA);
    }

    public void yellowA(View v) {
        yellowValueA = yellowValueA + 1;
        displayYellowA(yellowValueA);
    }

    public void redA(View v) {
        redValueA = redValueA + 1;
        displayRedA(redValueA);
    }

    //CONFIGURACOES PARA TIME B
    public void goalB(View v) {
        goalValueB = goalValueB + 1;
        displayGoalB(goalValueB);
    }

    public void penaltyB(View v) {
        penaltyValueB = penaltyValueB + 1;
        displayPenaltyB(penaltyValueB);
    }

    public void cornerB(View v) {
        cornerValueB = cornerValueB + 1;
        displayCornerB(cornerValueB);
    }

    public void foulsB(View v) {
        foulsValueB = foulsValueB + 1;
        displayFoulsB(foulsValueB);
    }

    public void yellowB(View v) {
        yellowValueB = yellowValueB + 1;
        displayYellowB(yellowValueB);
    }

    public void redB(View v) {
        redValueB = redValueB + 1;
        displayRedB(redValueB);
    }

    //CRIANDO FUNCAO PARA RESETAR OS VALORES
    public void reset(View v) {
        goalValueA = 0;
        penaltyValueA = 0;
        cornerValueA = 0;
        foulsValueA = 0;
        yellowValueA = 0;
        redValueA = 0;
        goalValueB = 0;
        penaltyValueB = 0;
        cornerValueB = 0;
        foulsValueB = 0;
        yellowValueB = 0;
        redValueB = 0;
        displayGoalA(goalValueA);
        displayPenaltyA(penaltyValueA);
        displayCornerA(cornerValueA);
        displayFoulsA(foulsValueA);
        displayYellowA(yellowValueA);
        displayRedA(redValueA);
        displayGoalB(goalValueB);
        displayPenaltyB(penaltyValueB);
        displayCornerB(cornerValueB);
        displayFoulsB(foulsValueB);
        displayYellowB(yellowValueB);
        displayRedB(redValueB);
    }

    //MOSTRAR CADA VALOR DO TIME A PARA O USUARIO
    public void displayGoalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltyValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowValueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redValueA);
        scoreView.setText(String.valueOf(score));
    }

    //MOSTRAR CADA VALOR DO TIME B PARA O USUARIO
    public void displayGoalB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltyValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowValueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redValueB);
        scoreView.setText(String.valueOf(score));
    }
}
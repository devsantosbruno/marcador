package com.example.marcadorfutebol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Váriaveis para A.
    int valorGolA = 0;
    int valorPenaltiA = 0;
    int valorEscanteioA = 0;
    int valorFaltaA = 0;
    int valorAmareloA = 0;
    int valorVermelhoA = 0;
    //Variáveis para B.
    int valorGolB = 0;
    int valorPenaltiB = 0;
    int valorEscanteioB = 0;
    int valorFaltaB = 0;
    int valorAmareloB = 0;
    int valorVermelhoB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Configurações para time A.
    public void golA(View v) {
        valorGolA = valorGolA + 1;
        displayGolA(valorGolA);
    }

    public void penaltiA(View v) {
        valorPenaltiA = valorPenaltiA + 1;
        displayPenaltiA(valorPenaltiA);
    }

    public void escanteioA(View v) {
        valorEscanteioA = valorEscanteioA + 1;
        displayEscanteioA(valorEscanteioA);
    }

    public void faltaA(View v) {
        valorFaltaA = valorFaltaA + 1;
        displayFaltaA(valorFaltaA);
    }

    public void amareloA(View v) {
        valorAmareloA = valorAmareloA + 1;
        displayAmareloA(valorAmareloA);
    }

    public void vermelhoA(View v) {
        valorVermelhoA = valorVermelhoA + 1;
        displayVermelhoA(valorVermelhoA);
    }

    //Mostrar cada valor de A para o usuário.
    public void displayGolA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorGolA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltiA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorPenaltiA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayEscanteioA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorEscanteioA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaltaA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorFaltaA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAmareloA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorAmareloA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayVermelhoA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorVermelhoA);
        scoreView.setText(String.valueOf(score));
    }

    //Configurações para time B.
    public void golB(View v) {
        valorGolB = valorGolB + 1;
        displayGolB(valorGolB);
    }

    public void penaltiB(View v) {
        valorPenaltiB = valorPenaltiB + 1;
        displayPenaltiB(valorPenaltiB);
    }

    public void escanteioB(View v) {
        valorEscanteioB = valorEscanteioB + 1;
        displayEscanteioB(valorEscanteioB);
    }

    public void faltaB(View v) {
        valorFaltaB = valorFaltaB + 1;
        displayFaltaB(valorFaltaB);
    }

    public void amareloB(View v) {
        valorAmareloB = valorAmareloB + 1;
        displayAmareloB(valorAmareloB);
    }

    public void vermelhoB(View v) {
        valorVermelhoB = valorVermelhoB + 1;
        displayVermelhoB(valorVermelhoB);
    }


    //Mostrar cada valor de B para o usuário.
    public void displayGolB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorGolB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltiB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorPenaltiB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayEscanteioB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorEscanteioB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaltaB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorFaltaB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAmareloB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorAmareloB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayVermelhoB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valorVermelhoB);
        scoreView.setText(String.valueOf(score));
    }

    //Criando função para resetar os valores.
    public void resetar(View v) {
        int valorGolA = 0;
        int valorPenaltiA = 0;
        int valorEscanteioA = 0;
        int valorFaltaA = 0;
        int valorAmareloA = 0;
        int valorVermelhoA = 0;
        int valorGolB = 0;
        int valorPenaltiB = 0;
        int valorEscanteioB = 0;
        int valorFaltaB = 0;
        int valorAmareloB = 0;
        int valorVermelhoB = 0;
        displayGolA(valorGolA);
        displayPenaltiA(valorPenaltiA);
        displayEscanteioA(valorEscanteioA);
        displayFaltaA(valorFaltaA);
        displayAmareloA(valorAmareloA);
        displayVermelhoA(valorVermelhoA);
        displayGolB(valorGolB);
        displayPenaltiB(valorPenaltiB);
        displayEscanteioB(valorEscanteioB);
        displayFaltaB(valorFaltaB);
        displayAmareloB(valorAmareloB);
        displayVermelhoB(valorVermelhoB);
    }
}
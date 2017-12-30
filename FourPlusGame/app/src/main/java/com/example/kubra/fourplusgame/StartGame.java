package com.example.kubra.fourplusgame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StartGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

    }
    public void StartGame(View v)
    {
        ArrayList<Integer> NumberList = new ArrayList<Integer>();
        ArrayList <Integer> List = new ArrayList<Integer>();
        NumberList.clear();
        Random rand = new Random();
        NumberList.clear();
        for(int i=1;i<9;i++)
        {
            List.add(new Integer(i));
        }
        Collections.shuffle(List);
        for(int i=0;i<4;i++)
        {
            NumberList.add(List.get(i));
        }
        Intent intent = new Intent(StartGame.this,MainActivity.class);
        intent.putIntegerArrayListExtra("NumberList", NumberList);
        startActivity(intent);




    }
}

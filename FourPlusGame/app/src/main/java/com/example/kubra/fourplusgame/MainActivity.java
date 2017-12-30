package com.example.kubra.fourplusgame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView textViewScor,textViewTimer,tv;
EditText editTextGuess;
Thread t;
String str="";
Integer Arr[] = new Integer[4];

static int scor =0;
int sayi,count=0,guess;
    CountDownTimer countDownTimer;
ArrayList <Integer> NumberList = new ArrayList<Integer>();
    ArrayList <Integer> GuessList = new ArrayList<Integer>();
    ArrayList <Integer> List = new ArrayList<Integer>();
    ArrayList <Integer> GList = new ArrayList<Integer>();
Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        textViewScor = (TextView)findViewById(R.id.textViewScor);
        textViewTimer = (TextView)findViewById(R.id.textViewTimer);
        editTextGuess = (EditText)findViewById(R.id.editTextGuess);
        intent = getIntent();
        for(int i=1;i<9;i++)
        {
            List.add(new Integer(i));
        }
        Collections.shuffle(List);
        for(int i=0;i<4;i++)
        {
            NumberList.add(List.get(i));
        }
        ///////////////////////////////////////////////////////////////////////

        //Zamanlayici
        int seconds = 30;
        countDownTimer = new CountDownTimer(seconds*1000,1000) {
            @Override
            public void onTick(long l) {
                textViewTimer.setText("Seconds: "+(int)(l/1000));
            }

            @Override
            public void onFinish() {
                textViewScor.setText("Sure doldu. Oyunu kaybettiniz.");
            }
        }.start();
        ////////////////////////////////////////////////////////////////////////
    }



    public void EnterNumber(View v)  {
        NumberList=intent.getIntegerArrayListExtra("NumberList");
        tv.setText(NumberList.toString());
        int positive=0,negative=0;
        GuessList.clear();
        guess = Integer.parseInt(editTextGuess.getText().toString());
        for(int i=0;i<4;i++)
        {
            Arr[i] = guess%10;
            guess/=10;
        }
        for(int j=0;j<4;j++)
        {
            int s = Arr[Arr.length-j-1];
            GuessList.add(s);
        }
            for(int i=0;i<4;i++)
            {
                if(NumberList.get(i)==GuessList.get(i))
                    positive++;
                for(int j=0;j<4;j++)
                {
                    if(NumberList.get(i)==GuessList.get(j) && i!=j)
                        negative++;
                }
            }
            scor++;
            if(positive==4)
            {
                str ="Congratulations!!! Your Score: "+scor;
                textViewScor.setText(str);
                countDownTimer.cancel();

            }
            else
            {
                str += "+: "+positive+"-: "+negative;
                textViewScor.setText(str);
            }
    }



}
package com.example.aslig.projem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class projemActivity extends AppCompatActivity {
    Button giris;
    Button kayit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projem);

        giris=(Button)findViewById(R.id.giris);
        kayit=(Button)findViewById(R.id.kaydol);
    }
    public void girisyap(View v){
        Intent intent=new Intent(projemActivity.this,girisActivity.class);
        startActivity(intent);

    }
    public void kaydol(View v) {
        Intent intent = new Intent(projemActivity.this, koydolActivity.class);
        startActivity(intent);
    }
}

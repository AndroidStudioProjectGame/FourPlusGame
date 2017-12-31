package com.example.ahmtt.proje;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class koydolActivity extends AppCompatActivity {

    EditText edit,edit2,edit3,edit4,edit5;
    TextView tex,tex2,tex3,tex4,tex5;
    Button btn2;
    private veritabani oyun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koydol);
        oyun = new veritabani(this);

        edit=(EditText)findViewById(R.id.adıSoyadı);
        edit2=(EditText)findViewById(R.id.mail);
        edit3=(EditText)findViewById(R.id.editText6);
        edit4=(EditText)findViewById(R.id.editText7);
        edit5=(EditText)findViewById(R.id.dogumTarihi);

        tex=(TextView)findViewById(R.id.textView5);
        tex2=(TextView)findViewById(R.id.textViewa5);
        tex3=(TextView)findViewById(R.id.textView6);
        tex4=(TextView)findViewById(R.id.textView7);
        tex5=(TextView)findViewById(R.id.textView8);

        btn2=(Button) findViewById(R.id.buttona);
    }

    public  void kaydol(View v){
        try{

            KayitEkle(edit.getText().toString(),edit2.getText().toString());
        }

               finally{
            oyun.close();
        }

    }
    private void KayitEkle(String isim, String mail){
        SQLiteDatabase db = oyun.getWritableDatabase();
        ContentValues veriler = new ContentValues();
        veriler.put("isim", isim);
        veriler.put("mail",mail);
        db.insertOrThrow("oyunkayit", null, veriler);
    }



}


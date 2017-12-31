package com.example.ahmtt.proje;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.widget.EditText;


public class profilActivity extends AppCompatActivity {
    private veritabani oyun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        oyun = new veritabani(this);

    }
    private Cursor KayitGetir(){

        SQLiteDatabase db = oyun.getReadableDatabase();

        //Cursor cursor = db.query("oyunkayit", new String[]{"SELECT"}, null, null, null, null, null);
       // Cursor cursor = db.rawQuery(“SELECT, isim, soyad ,FROM, oyunkayıt”, null);

        return cursor;

    }
    private void KayitGoster(Cursor cursor){
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        while(cursor.moveToNext()){
            String adsoyad = cursor.getString((cursor.getColumnIndex("isim")));
            String mail = cursor.getString((cursor.getColumnIndex("mail")));

            builder.append(adsoyad);
            builder.append(mail);
        }
        EditText text = (EditText) findViewById(R.id.editText2);
        text.setText(builder);
    }


}

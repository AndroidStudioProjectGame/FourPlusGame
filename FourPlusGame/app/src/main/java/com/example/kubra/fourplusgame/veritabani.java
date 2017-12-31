package com.example.ahmtt.proje;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class veritabani extends SQLiteOpenHelper {
    private static final String VERITABANI = "oyun.db";
    private static final int SURUM = 1;
    public veritabani (Context con)
    {
        super(con,VERITABANI,null,SURUM);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE ogrenciisim (id INTEGER PRIMARY KEY AUTOINCREMENT,adisoyadi TEXT,dogumtarihi TEXT,mail TEXT,sifre TEXT);");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE If EXIST oyunkayit");
        onCreate(db);

    }
}

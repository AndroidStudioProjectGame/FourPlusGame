package com.example.aslig.projem;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class baslaActivity extends AppCompatActivity {

    TextView tv5;
    beniHatirla sharedPreferences;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basla);

        tv5=(TextView)findViewById(R.id.textView4n);
        sharedPreferences=new beniHatirla();
        tv5.setText(sharedPreferences.getValue(context,"mail"));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.optionsmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();

                break;
            case R.id.item2:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }





}

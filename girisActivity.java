package com.example.aslig.projem;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class girisActivity extends AppCompatActivity {
    EditText et, et2;
    Button btn;
    CheckBox cb;
    Context context = this;

    beniHatirla sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        unit();


        if(sharedPreferences.getValueBoolean(context,"beniHatirla")){
            cb.setChecked(sharedPreferences.getValueBoolean(context,"beniHatirla"));
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().equals(getString(R.string.test_mail)) && et2.getText().toString().equals(getString(R.string.test_password))) {
                    Intent intent = new Intent(context, baslaActivity.class);
                    startActivity(intent);
                    if(cb.isChecked()){
                        sharedPreferences.save(context,"mail",et.getText().toString());
                    }
                    else{
                        sharedPreferences.save(context,"mail","");
                    }
                    sharedPreferences.saveBoolean(context,"beniHatirla",cb.isChecked());

                } else {
                    Toast.makeText(context, getString(R.string.login_error), Toast.LENGTH_LONG).show();
                }


            }
        });
    }

    public void unit() {
        et = (EditText) findViewById(R.id.editTexte);
        et2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.buttonGiris);
        cb = (CheckBox) findViewById(R.id.checkBox);
        sharedPreferences=new beniHatirla();

    }
    public void giris(View v){
        Intent intent = new Intent(girisActivity.this, baslaActivity.class);
        startActivity(intent);}
}

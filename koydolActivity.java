package com.example.aslig.projem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class koydolActivity extends AppCompatActivity {

    EditText edit,edit2,edit3,edit4,edit5;
    TextView tex,tex2,tex3,tex4,tex5;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koydol);
        edit=(EditText)findViewById(R.id.editText4);
        edit2=(EditText)findViewById(R.id.editText5);
        edit3=(EditText)findViewById(R.id.editText6);
        edit4=(EditText)findViewById(R.id.editText7);
        edit5=(EditText)findViewById(R.id.editText9);

        tex=(TextView)findViewById(R.id.textView5);
        tex2=(TextView)findViewById(R.id.textViewa5);
        tex3=(TextView)findViewById(R.id.textView6);
        tex4=(TextView)findViewById(R.id.textView7);
        tex5=(TextView)findViewById(R.id.textView8);

        btn2=(Button) findViewById(R.id.buttona);
    }
}

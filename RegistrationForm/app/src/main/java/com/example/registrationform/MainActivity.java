package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText er,en,eph,ee,epw;
    RadioButton rm,rf;
    Spinner spb;
    String gen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        er=findViewById(R.id.roll);
        en=findViewById(R.id.name);
        eph=findViewById(R.id.ph);
        ee=findViewById(R.id.email);
        epw=findViewById(R.id.pass);
        spb=findViewById(R.id.sp);
        rm=findViewById(R.id.m);
        rf=findViewById(R.id.f);
        ArrayAdapter<CharSequence> bs=ArrayAdapter.createFromResource(MainActivity.this,R.array.branch,android.R.layout.simple_spinner_item);
        spb.setAdapter(bs);





    }



    public void sub(View view) {

        String roll=er.getText().toString();
        String name=en.getText().toString();
        String ph=eph.getText().toString();
        String email=ee.getText().toString();
        String password=epw.getText().toString();
        if(rm.isChecked())
        {
            gen=rm.getText().toString();
        }
        else if(rf.isChecked())
        {
            gen=rf.getText().toString();
        }
        String branch=spb.getSelectedItem().toString();


        if(name.isEmpty() || roll.isEmpty() || ph.isEmpty() || email.isEmpty() || password.isEmpty() || gen.isEmpty() || branch.isEmpty())
        {
            Toast.makeText(MainActivity.this,"pls enter the details... don't leave any column",Toast.LENGTH_SHORT).show();
        }
        else
        {

            Intent i=new Intent(MainActivity.this,Details.class);
            i.putExtra("name",name);
            i.putExtra("rollno",roll);
            i.putExtra("phno",ph);
            i.putExtra("email",email);
            i.putExtra("pass",password);
            i.putExtra("gender",gen);
            i.putExtra("branch",branch);
            startActivity(i);

        }
    }
}
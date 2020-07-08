package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText u,p,e,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        u=findViewById(R.id.ue);
        p=findViewById(R.id.pd);
        e=findViewById(R.id.ed);
        m=findViewById(R.id.pr);
    }

    public void ok(View view) {

        String ue,pd,ed,pr;
        ue=u.getText().toString();
        pd=p.getText().toString();
        ed=e.getText().toString();
        pr=m.getText().toString();
        if(ue.isEmpty() || pd.isEmpty() || ed.isEmpty() || pr.isEmpty())
        {
            Toast.makeText(Register.this, "SOME THING IS EMPTY", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent n=new Intent(Register.this,MainActivity.class);
            startActivity(n);
        }

    }
}
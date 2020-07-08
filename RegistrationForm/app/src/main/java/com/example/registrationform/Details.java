package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tv=findViewById(R.id.detials);
        String n=getIntent().getStringExtra("name");
        String r=getIntent().getStringExtra("rollno");
        String p=getIntent().getStringExtra("phno");
        String e=getIntent().getStringExtra("email");
        String pw=getIntent().getStringExtra("pass");
        String g=getIntent().getStringExtra("gender");
        String b=getIntent().getStringExtra("branch");
        tv.setText("USER DETAILS"+"\n"+"Roll number:"+r+"\n"+"Name:"+n+"\n"+"Phone:"+p+"\n"+"Email id:"+e+"\n"+"password:"+pw+"\n"+"Gender"+g+"\n"+"Branch"+b);

    }
}
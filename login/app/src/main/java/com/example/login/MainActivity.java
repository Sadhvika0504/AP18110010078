package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText us,pass;
    String logi,pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us=findViewById(R.id.user);
        pass=findViewById(R.id.pass);

    }

    public void login(View view) {
        logi=us.getText().toString();
        pa=pass.getText().toString();
        if(logi.isEmpty() || pa.isEmpty() )
        {
            Toast.makeText(MainActivity.this," Username or password should not be empty",Toast.LENGTH_SHORT).show();

        }
        else{
            Intent p=new Intent(MainActivity.this,Home.class);
            p.putExtra("name",logi);
            startActivity(p);


        }
    }

    public void register(View view) {
        Intent p=new Intent(MainActivity.this,Register.class);
        startActivity(p);
    }
}
package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    Button login;
    EditText email,pass;
    ProgressBar pd;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        login =findViewById( R.id.login);
        email=findViewById( R.id.text1 );
        pass=findViewById(R.id.text );
        sp = getSharedPreferences("Login", MODE_PRIVATE);
        if(sp.getBoolean("logged",false)){
            Intent intent=new Intent(MainActivity.this,naviActivity.class);
            startActivity(intent);
        }
        loadingBar=new ProgressDialog( this );

        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(email.getText().toString().equals("admin") &&
                        pass.getText().toString().equals("admin"))
                {

                    Intent intent=new Intent(MainActivity.this,naviActivity.class);
                    startActivity(intent);
                }



            }
        } );
    }
}
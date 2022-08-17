package com.example.cardock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username =(EditText) findViewById(R.id.username);
        EditText password =(EditText) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton)  findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("root")) {
                    Toast.makeText(MainActivity.this, "LOG IN SUCCESSFULL", Toast.LENGTH_SHORT).show();


                } else
                    Toast.makeText(MainActivity.this, "LOG IN UNSUCCESSFULL", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, registration.class);
                startActivity(intent);

            }



        });

    }
}
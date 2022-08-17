package com.example.cardock;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class registration extends MainActivity {

    EditText Name;
    EditText Number;
    EditText Model;
    EditText Fuel;
    EditText Engine;
    MaterialButton Registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Name = findViewById(R.id.name);
        Number = findViewById(R.id.number);
        Model = findViewById(R.id.model);
        Fuel = findViewById(R.id.fuel);
        Engine = findViewById(R.id.engine);
        Registerbtn = findViewById(R.id.regbtn);

        ArrayList<Details> details = new ArrayList<>();

        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name_X = Name.getText().toString();
                String Register_X = Number.getText().toString();
                String Register_Y = Model.getText().toString();
                String Name_Y = Fuel.getText().toString();
                String Name_Z = Engine.getText().toString();
                Boolean check = validationInfo(Name_X,Register_X,Register_Y,Name_Y,Name_Z);
                if(check == true){
                    Details d = new Details();
                    d.Name = Name_X;
                    d.Number = Register_X;
                    d.Model = Register_Y;
                    d.Fuel = Name_Y;
                    d.Engine = Name_Z;
                    details.add(d);
                    System.out.println(d.Name);
                }
            }
        });
    }

    private Boolean validationInfo(String Name_X, String Register_X, String Register_Y, String Name_Y, String Name_Z ){
        if(Name_X.length() == 0){
            Name.requestFocus();
            Name.setError("Empty");
            return false;
        }else if(Register_X.length() == 0){
            Number.requestFocus();
            Number.setError("Empty");
            return false;
        }else if (Register_Y.length() == 0){
            Model.requestFocus();
            Model.setError("Empty");
            return false;
        }else if (Name_Y.length() == 0){
            Fuel.requestFocus();
            Fuel.setError("Empty");
            return false;
        }else if (Name_Z.length() == 0){
            Engine.requestFocus();
            Engine.setError("Empty");
            return false;
        }else {
            Toast.makeText(registration.this, "REGISTERED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}
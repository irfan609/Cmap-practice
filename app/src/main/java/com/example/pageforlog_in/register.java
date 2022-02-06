package com.example.pageforlog_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class register extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        final EditText edit_name = findViewById(R.id.regusername);
        final EditText edit_password = findViewById(R.id.regpasword);
        Button btn = findViewById(R.id.insert);
        DAOuser dao =new DAOuser();
        btn.setOnClickListener(v->
        {
            user emp = new user(edit_name.getText().toString(), edit_password.getText().toString());

                dao.add(emp).addOnSuccessListener(suc ->
                {
                    Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er ->
                {
                    Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
                });
        });


    }
}
package com.example.pageforlog_in;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button login;
private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name;
        final EditText password;
        DAOuser dao = new DAOuser();

        name=findViewById(R.id.username);
        password=findViewById(R.id.pasword);
        login = (Button) findViewById(R.id.login);
        register = (TextView) findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override

        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
    }
}
    }
    private void checkLogin(){

        name = name.getText().toString();
        password = password.getText().toString();

        if (name.isEmpty()||password.isEmpty()){
            Toast.makeText(MainActivity.this, "email or password cannot empty", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(name,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            finish();
                            Intent i = new Intent(getApplicationContext(),welcome.class);
                            startActivity(i);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(MainActivity.this, "Login Unsuccessful, Email or Password ", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,login.class);
        startActivity(intent);
    }
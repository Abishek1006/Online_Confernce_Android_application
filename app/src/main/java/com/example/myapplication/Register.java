package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    TextInputEditText editTextEmail, editTextPassword;
    Button buttonReg;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth=FirebaseAuth.getInstance();
        editTextEmail = findViewById(R.id.email);
        progressBar=findViewById(R.id.progressbar);
        editTextPassword = findViewById(R.id.password);
        textView = findViewById(R.id.loginnow);
        buttonReg = findViewById(R.id.btn_register);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();

            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                String email, password;
                email = String.valueOf(editTextEmail.getText());
                progressBar.setVisibility(View.GONE);
                password = String.valueOf(editTextPassword.getText());

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Register.this,"enter email", Toast.LENGTH_SHORT).show();
                     return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Register.this,"enter pass", Toast.LENGTH_SHORT).show();
                     return;
                }
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(getApplicationContext(), Login.class);
                                    startActivity(intent);
                                    finish();
                                    Toast.makeText(Register.this, "verified",
                                            Toast.LENGTH_SHORT).show();

                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(Register.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });

                }

        });


    }
}
package com.example.chat_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;

public class RegActivity extends AppCompatActivity {
    private EditText mPhoneNumber, mCode ;
    private Button mSend ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        FirebaseApp.initializeApp(this);

        mPhoneNumber = findViewById(R.id.phoneNumber) ;
        mCode = findViewById(R.id.code) ;
        mSend = findViewById(R.id.verify);
    }
}

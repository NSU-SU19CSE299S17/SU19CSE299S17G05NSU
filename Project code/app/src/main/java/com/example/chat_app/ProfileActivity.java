package com.example.chat_app;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private String receiveUserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        receiveUserId = getIntent().getExtras().get("visit_user_id").toString() ;

        Toast.makeText(this, "User ID: " +receiveUserId, Toast.LENGTH_SHORT).show();
    }
}

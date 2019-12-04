package com.example.ciphers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonChipher(View view) {
        Intent intent = new Intent(this, List.class);
        startActivity(intent);
    }

    public void buttonDecryption(View view) {
        Intent intent = new Intent(this, List2.class);
        startActivity(intent);
    }


}

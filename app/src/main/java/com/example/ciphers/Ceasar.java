package com.example.ciphers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ceasar extends AppCompatActivity {

    EditText etKey, etText, etRes;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasar);

        etKey = (EditText) findViewById(R.id.editKey);
        etText = (EditText) findViewById(R.id.editText);

    }

    public void buttonCeasar(View view) {
        CeasarCipher cipher = new CeasarCipher();

        String cip = etText.getText().toString();
        int key = Integer.parseInt(etKey.getText().toString().trim());

        etRes = (EditText) findViewById(R.id.editTextCeasar);

        etRes.setText(cipher.cipher(cip, key));
    }

    public void buttonCeasar2(View view) {

        CeasarCipher cipher = new CeasarCipher();

        String cip = etText.getText().toString();
        int key = Integer.parseInt(etKey.getText().toString().trim())*(-1);

        etRes = (EditText) findViewById(R.id.editTextCeasar);

        etRes.setText(cipher.cipher(cip, key));

    }
}

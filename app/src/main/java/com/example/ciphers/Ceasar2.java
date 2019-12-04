package com.example.ciphers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ceasar2 extends AppCompatActivity {

    EditText etKey, etText, etRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasar2);

        etKey = (EditText) findViewById(R.id.editKey2);
        etText = (EditText) findViewById(R.id.editText2);
    }

    public void buttonCeasar2(View view) {

        CeasarCipher cipher = new CeasarCipher();

        String cip = etText.getText().toString();
        int key = Integer.parseInt(etKey.getText().toString().trim())*(-1);

        etRes = (EditText) findViewById(R.id.editTextCeasar2);

        etRes.setText(cipher.cipher(cip, key));

    }


}

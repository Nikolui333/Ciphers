package com.example.ciphers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GronsfeldActivity extends AppCompatActivity {

    EditText etKey, etText, etRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gronsfeld);

        etKey = (EditText) findViewById(R.id.editKey);
        etText = (EditText) findViewById(R.id.editText);
    }

    public void buttonCeasar(View view) {
        Gronsfeld gronsfeld = new Gronsfeld();

        String cip = etText.getText().toString();
        int key = Integer.parseInt(etKey.getText().toString().trim());

        String str = Integer.toString(key);
        int[] arrKey = new int[str.length()];
        int newKey = key;
        for (int i = str.length() - 1; i >= 0; i--) { //разбиение ключа на части, для создания ключей для разных символов
            arrKey[i] = key % 10;
            if (arrKey[i]==0){
                arrKey[i]++;
            }
            key /= 10;
        }

        etRes = (EditText) findViewById(R.id.editTextCeasar);

        etRes.setText(gronsfeld.encryption(cip, arrKey ,newKey));
    }

    public void buttonCeasar2(View view) {

        Gronsfeld gronsfeld = new Gronsfeld();

        String cip = etText.getText().toString();

        int key = Integer.parseInt(etKey.getText().toString().trim()); // менять нужно эту строку

        String str = Integer.toString(key);
        int[] arrKey = new int[str.length()];
        int newKey = key;
        for (int i = str.length() - 1; i >= 0; i--) {
            arrKey[i] = key % 10*(-1);
            if (arrKey[i]==0){
                arrKey[i]++;
            }
            key /= 10;
        }

        etRes = (EditText) findViewById(R.id.editTextCeasar);

        etRes.setText(gronsfeld.encryption(cip, arrKey ,newKey));
    }

    public void buttonKey(View view){
        KeyGenerator generator = new KeyGenerator();

        etKey = (EditText) findViewById(R.id.editKey);

        int key = generator.appropriation();

        String res = key+"";

        etKey.setText(res);
    }
}

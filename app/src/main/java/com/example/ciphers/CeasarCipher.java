package com.example.ciphers;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.ciphers.R.id.editTextCeasar;

public class CeasarCipher extends AppCompatActivity {

   // TextView temp;
    

    public String cipher(String str, int key){

        int c = 0;
        int y = 0;
        String new_str = "";
        for (int j =0;j<str.length();j++) {
            int a = str.charAt(j);
            if (a <= 1071 && a>=1040) {
                int key2=key;
                if (key<0){
                    key2=32+key%32;
                }
                c = (str.charAt(j) + key2);
                y = (c - 1040) % 32 + 1040; // 1040 - это код буквы А, 32 - это кол-во букв
                new_str += (char) y; // получаем букву по коду
            }
            else if (a>1071){
                int key2=key;
                if (key<0){
                    key2=32+key%32;
                }
                c = (str.charAt(j) + key2);
                y = (c - 1072) % 32 + 1072; // 1072 - это код буквы а, 32 - это кол-во букв
                new_str += (char) y; // получаем букву по коду
            }
            else if (a>=32 && a<=47){
                int key2=key;
                if (key<0){
                    key2=16+key%16;
                }
                c = (str.charAt(j)+key2);
                y = (c - 32) % 16 + 32;
                new_str += (char) y;
            }

            else if (a>47&&a<=57){
                int key2=key;
                if (key<0){
                    key2=10+key%10;
                }
                c = (str.charAt(j)+key2);
                y = (c - 47) % 10 + 47;
                new_str += (char) y;
            }

            else if (a>57&&a<=64){
                int key2=key;
                if (key<0){
                    key2=7+key%7;
                }
                c = (str.charAt(j)+key2);
                y = (c - 58) % 7 + 58;
                new_str += (char) y;
            }

            else if (a>=65&&a<=90){
                int key2=key;
                if (key<0){
                    key2=26+key%26;
                }
                c = (str.charAt(j)+key2);
                y = (c - 65) % 26 + 65;
                new_str += (char) y;
            }

            else if(a>=97&&a<=122){
                int key2=key;
                if (key<0){
                    key2=26+key%26;
                }
                c = (str.charAt(j)+key2);
                y = (c - 97) % 26 + 97;
                new_str += (char) y;
            }

            else  if (a==1105){

            }
        }
        return new_str;
    }

}

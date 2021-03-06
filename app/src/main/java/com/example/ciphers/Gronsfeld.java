package com.example.ciphers;

public class Gronsfeld {

    public String encryption(String text, int [] arrKey, int key){
        char [] symbols = text.toCharArray();
        String str = Integer.toString(key);

        String res="";
        int c = 0;
        int y = 0;

        int counter = 0; // счётчик
        for (int i =0;i<text.length();i++){
            if ((int) symbols[i]>=97&&(int) symbols[i]<=122){ // a-z
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=26+arrKey[counter]%26;
                }
                c = (text.charAt(i)+key2);
                y = (c - 97) % 26 + 97;
                res += (char) y;
                counter++;
                //System.out.println(counter);
            }

            else if (symbols[i]>1071){ //а-я
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=32+arrKey[counter]%32;
                }
                c = (text.charAt(i) + key2);
                y = (c - 1072) % 32 + 1072; // 1072 - это код буквы а, 32 - это кол-во букв
                res += (char) y; // получаем букву по коду
                counter++;
            }

            else if (symbols[i]>=1040&&symbols[i]<=1071){ //А-Я
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=32+arrKey[counter]%32;
                }
                c = (text.charAt(i) + key2);
                y = (c - 1040) % 32 + 1040; // 1072 - это код буквы а, 32 - это кол-во букв
                res += (char) y; // получаем букву по коду
                counter++;
            }
            else if (symbols[i]>=32 && symbols[i]<=47){ //разные символы
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=16+arrKey[counter]%16;
                }
                c = (text.charAt(i)+key2);
                y = (c - 32) % 16 + 32;
                res += (char) y;
                counter++;
            }

            else if (symbols[i]>=48&&symbols[i]<=57){ //числа
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=10+arrKey[counter]%10;
                }
                c = (text.charAt(i)+key2);
                y = (c - 48) % 10 + 48;
                res += (char) y;
                counter++;
            }

            else if (symbols[i]>57&&symbols[i]<=64){ //разные символы
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=7+arrKey[counter]%7;
                }
                c = (text.charAt(i)+key2);
                y = (c - 58) % 7 + 58;
                res += (char) y;
                counter++;
            }

            else if (symbols[i]>=65&&symbols[i]<=90){ //A-Z
                int key2=arrKey[counter];
                if (arrKey[counter]<0){
                    key2=26+arrKey[counter]%26;
                }
                c = (text.charAt(i)+key2);
                y = (c - 65) % 26 + 65;
                res += (char) y;
                counter++;
            }

            if (counter>=str.length())
                counter=0;
        }
        return  res;
    }
}

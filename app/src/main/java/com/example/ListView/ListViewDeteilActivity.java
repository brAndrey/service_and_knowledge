package com.example.ListView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ListViewDeteilActivity extends AppCompatActivity {

    private static final String TAG = "DeteilActivity ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_deteil);

        WebView webView = findViewById(R.id.webView);

        Intent intent = getIntent();

        // получаем строку и формуруем имя ресурса

        String resName = "listview"+intent.getIntExtra("title",0);

        Log.i("name",resName);

        Context context=getBaseContext(); // получаем контекст

        // читаем текст из файла из ресурсов по имени
        String text = readRawTextFile (context, getResources().getIdentifier(resName,"raw","com.example.andrey_vb.kets"));

        webView.loadDataWithBaseURL(null,text,"text/html","eu_US",null);

    }

    //читаем текст из raw-ресурсов
    private String readRawTextFile(Context context, int resId) {

        if (resId==0){return " fail not read. Id is 0 ";}

        InputStream inputStream = context.getResources().openRawResource(resId);

        InputStreamReader inputReader = new InputStreamReader(inputStream);
        BufferedReader buffReader = new BufferedReader(inputReader);
        String line;
        String elementLine; String wordLine;
        StringBuilder builder = new StringBuilder();

        Log.v("My Project", "[ImageLoader:loadFile]: Opening file...");


        try{
            while ((line = buffReader.readLine()) !=null){

                Log.d("My Project", "Line "+line);
                Log.d("My Project", "Length line "+line.toString().length());

//                builder.append(line);


                // Если строка не пустая
                if(line.isEmpty()) {

                    builder.append(" ДОБАВИМ "+line+" "+line.toString().length()+"   ");
                } else {
                   // разделяем строку на слова
                    String[] words = line.split("\\s+");
                    //пишем
                    for (int i = 0; i < words.length; i++) {
                        String strToPrint = words[i];
                        Log.d("My Project", "Words "+ i+"  "+strToPrint);
                        builder.append("Эл_ "+ i +"  "+strToPrint+"  ");
                    }
                }
                builder.append("\n");
                Log.i(TAG, "Это мое");
            }
        } catch (IOException e){
            return null;
        }
        return builder.toString();
    }
}

    /*
    int aNums[] = { 2, 4, 6 };

for (int i = 0; i < aNums.length; i++) {
        String strToPrint = "aNums[" + i + "]=" + aNums[i];
        }*/
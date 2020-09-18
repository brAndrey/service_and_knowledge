package com.example.serviceandknowledge;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AsyncTaskActivity extends AppCompatActivity {
    // пример взят по этой ссылке
    //https://metanit.com/java/android/10.1.php

    int[] integers=null;
    int clicks = 0;
    ProgressBar indicatorBar;
    TextView statusView;
    TextView clicksView;
    Button progressBtn;
    Button clicksBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actyvity_asynctask);

        indicatorBar = (ProgressBar) findViewById(R.id.indicator);
        statusView = (TextView) findViewById(R.id.statusView);
        progressBtn = (Button) findViewById(R.id.progressBtn);
        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // запускаем класс содержащий AsunkTask
                new ProgressTask().execute();
            }
        });

        clicksView = (TextView) findViewById(R.id.clicksView);
        clicksBtn = (Button) findViewById(R.id.clicksBtn);
        clicksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicks++;
                clicksView.setText("Clicks: " + clicks);
            }
        });
    }
                              //входящий , итерационный, итоговый - параметры
    class ProgressTask extends AsyncTask<Void, Integer, String> {

        @Override
        protected String doInBackground(Void... unused ) {
        //выполняется в фоновом потоке, должен возвращать определенный результат
            for (int i = 0; i<integers.length;i++) {

                publishProgress(i); // i - засылаем в onProgressUpdate
                SystemClock.sleep(400);
            }
            return("Задача завершена");
        }

        @Override
        protected void onProgressUpdate(Integer... items) {
            //позволяет сигнализировать пользователю о выполнении фонового потока
            indicatorBar.setProgress(items[0]+1);
            statusView.setText("Статус: " + String.valueOf(items[0]+1));
        }

        @Override
        protected void onPreExecute() {
            //вызывается из главного потока перед запуском метода doInBackground()
            super.onPreExecute();
            integers = new int[100];
            for(int i=0;i<100;i++) {
                integers[i] = i + 1;
            }
        }

        //выполняется из главного потока после завершения работы метода doInBackground()
        @Override
        protected void onPostExecute(String message) {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT)
                    .show();
        }
    }

}

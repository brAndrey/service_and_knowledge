package com.example.serviceandknowledge;

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

    public void RxLesson(View view) {
        Intent intent = new Intent(MainActivity.this, RxLessonActivity.class);
        startActivity(intent);


    }

    public void AsyncTask(View view) {
        Intent intent = new Intent(MainActivity.this, AsyncTaskActivity.class);
        startActivity(intent);
    }
}
package com.example.serviceandknowledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.GreenDao.screen.CatsGreenDaoActivity;
import com.example.ListView.ListViewActivity;
import com.example.RecyclerView.RecyclerViewActivity;
import com.example.orientation_fragments.OrientationFragmentsActivity;

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

    public void OrientationFragment(View view) {
        Intent intent = new Intent(MainActivity.this, OrientationFragmentsActivity.class);
        startActivity(intent);
    }


    public void RecyclerViewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void ListView(View view) {
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }

    public void CatsGreenDao(View view) {
        Intent intent = new Intent(MainActivity.this, CatsGreenDaoActivity.class);
        startActivity(intent);
    }
}
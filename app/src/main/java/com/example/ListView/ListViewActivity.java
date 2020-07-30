package com.example.ListView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    private String[] titles= {"00 Файл 1","01 Файл 2","02 Файл 3"};


    int[][] a = {
            { 1, 2, 3 },
            { 4, 5, 6 }
    };
    /*private Object a;
    private Object v;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Получаем идентификатор ListView
        ListView listView = findViewById(R.id.listView);

        // установить массив в ListView
        //listView.setAdapter( new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles));
        listView.setAdapter( new ArrayAdapter<>(this, R.layout.list_activity_element,R.id.textView, titles));
        listView.setTextFilterEnabled(true);

        //обрабатывае щелчки на элементах ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> a, View v, int position, long id){
                Intent intent = new Intent();
                intent.setClass(ListViewActivity.this, ListViewDeteilActivity.class);
                intent.putExtra("title", position);
                // запустить вторую активность
                startActivity(intent);
            }
        });



    }
}

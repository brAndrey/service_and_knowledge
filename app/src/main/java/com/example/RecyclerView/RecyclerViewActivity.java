package com.example.RecyclerView;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.serviceandknowledge.R;

import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    //ссылка на адаптер, класс который знает всё о модели и дёргает методы холдера
    private ElementAdapter elementAdapter;
    //ссылка на вьюшку из представления
    private RecyclerView recyclerView;

    // http://javaway.info/kak-ispolzovat-spisok-v-android/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Заполняем лайаут Activity контейнером с единственным виджетом RecyclerView
        setContentView(R.layout.activity_recyclerview);
        //Находим ссылку на контейнер - виджет
        recyclerView = findViewById(R.id.recyclerView);
        //LinearLayoutManager занимается размещением объектов на экране и прокруткой
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Подготавливаем список данных и заполняем его
        List<CloneFactory.Person> personList = CloneFactory.getCloneList();
        //Создаём экземпляр адаптера и передаём ему список данных. Далее руководит ими он
        elementAdapter = new ElementAdapter(personList,this);
        //Назначаем вьюхе адаптером наш экземпляр PersonAdapter
        recyclerView.setAdapter(elementAdapter);
    }
}

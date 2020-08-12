package com.example.RecyclerView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.serviceandknowledge.R;

import java.util.List;

public class ElementAdapter extends RecyclerView.Adapter<ElementHolder> {

    private static final String LOG= ElementAdapter.class.getName();

    private List<CloneFactory.Person> mPerson;
    Context context;

    public ElementAdapter(List<CloneFactory.Person> persen, Context context) {
        mPerson = persen;
        this.context = context;
    }

    //Создаёт пустую вьюшку,оборачивает её в PersonHolder.
    //Дальше забота по наполнению этой вьюшки ложиться именно на объект PersonHolder'а
    @NonNull
    @Override
    public ElementHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(LOG," onCreateViewHolder " );
        LayoutInflater  layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.list_item_recyclerview, parent, false);
        return new ElementHolder(view);
    }

    //Активирует метод холдера при выводе нового элемента списка на экран,
    //передавая ему актуальный объект модели для разбора и представления
    @Override
    public void onBindViewHolder(@NonNull ElementHolder holder, int position) {
        Log.i(LOG," onBindViewHolder "+position );
        CloneFactory.Person person = mPerson.get(position);
        holder.bindCrime(person);
    }

    //Возвращает размер хранилища моделей
    @Override
    public int getItemCount() {
        Log.i(LOG," getItemCount " + mPerson.size() );
        return mPerson.size();
    }
}

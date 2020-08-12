package com.example.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.serviceandknowledge.R;

/*Класс PersonHolder занят тем, что держит на готове ссылки на элементы виджетов,
    которые он с радостью наполнит данными из объекта модели в методе bindCrimе.
    Этот класс используется только адаптером.  Адаптер дёргает его и поручает
    грязную работу по заполнению виджетов*/

public class ElementHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private static final String LOG = ElementHolder.class.getName();
    private TextView mPersonNameTextView;
    private TextView mPersonAdressTextView;
    private TextView mPersonSexTextView;
    private TextView mPersonAgeTextView;
    private CloneFactory.Person mPerson;


    public ElementHolder(@NonNull View itemView) {
        super(itemView);
        Log.i(LOG,"PersonHolder " );
        mPersonNameTextView = itemView.findViewById(R.id.personNameView);
        mPersonAdressTextView = itemView.findViewById(R.id.personAdressView);
        mPersonAgeTextView = itemView.findViewById(R.id.personAgeView);
        mPersonSexTextView = itemView.findViewById(R.id.personSexView);
        itemView.setOnClickListener(this);

    }
    //Метод, связывающий ранее добытые в конструкторе ссылки с данными модели

    public void bindCrime(CloneFactory.Person person) {
        Log.i(LOG,"bindCrime " + person.getNomber() );
        mPerson = person;
        mPersonNameTextView.setText(mPerson.getName());
        mPersonAdressTextView.setText(mPerson.getAdress());
        mPersonAgeTextView.setText(String.valueOf(mPerson.getAge()));
        if (mPerson.isSex()) {
            mPersonSexTextView.setText("Мужчина");
        } else {
            mPersonSexTextView.setText("Женщина");
        }
    }

    @Override
    public void onClick(View view) {
        Log.i("PersonHolder ","onClick"+getLayoutPosition());
        //Toast.makeText(PersonHolder, "Имя или порода не заполнены", Toast.LENGTH_SHORT).show();
    }
}



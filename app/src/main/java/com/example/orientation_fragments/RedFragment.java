package com.example.orientation_fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.serviceandknowledge.R;

public class RedFragment extends Fragment {

    int clicks;
TextView textViewRed;
    private onFragmentInteractionListener mListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_red, container, false);
        Button button = (Button) view.findViewById(R.id.button);
        textViewRed = view.findViewById(R.id.textViewRed);
        //задаём слушатель кнопки
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount();
            }
        });
        return view;
    }

    /*Фрагменты не могут напрямую взаимодействовать между собой. Для этого
    надо обращаться к контексту, в качестве которого выступает класс Activity.
    Для обращения к activity, как правило, создается вложенный интерфейс. */
    // вложенный интерфейс для обращения к activity
    interface onFragmentInteractionListener {
        void onFragmentInteraction(int link);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            // прикрепляем текущий фрагмент к activity
            mListener= (onFragmentInteractionListener) context;

        } catch (ClassCastException e) {
            e.printStackTrace();
            throw new ClassCastException(context.toString()
                    +" должен реализовывать интерфейс OnFragmentInteractionListener");
        }

    }

    public void clickCount() {
        // Посылаем данные в Activity
        int inActiviry=clicks++;
        mListener.onFragmentInteraction(inActiviry);

        // выводим тут
        textViewRed.setText(Integer.toString(inActiviry));
    }



}


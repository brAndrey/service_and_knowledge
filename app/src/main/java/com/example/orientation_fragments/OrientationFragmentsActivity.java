package com.example.orientation_fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.serviceandknowledge.R;

public class OrientationFragmentsActivity  extends AppCompatActivity implements RedFragment.onFragmentInteractionListener {

    private static final String KEY_NUMBER = "link";

    int currentLink;
    private  Counter counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orien_frag);

        // востанавливаем сохраненное значение
        if (savedInstanceState != null) {
            counter = savedInstanceState.getParcelable(KEY_NUMBER);
            Log.i("counter",counter.toString());
        } else {
            counter = new Counter();
        }

        // определение ориентации изображения
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // горизонтально
            TextView textView = findViewById(R.id.textViewOrientHorizont);
            textView.setText("Горизонтальная");
        }else {
            // вертикальная
            TextView textView = findViewById(R.id.textViewOrientVertial);
            textView.setText("Вертикальная");
        }


        Button buttonActivity = findViewById(R.id.buttonActivity);

        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateCounter();
                Log.i("counter",counter.toString());
                // прячем зеленый фрагмент
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragmenrGreen);
                if (!fragment.isHidden()) {
                    fragmentManager.beginTransaction().hide(fragment).commit();
                } else {
                    fragmentManager.beginTransaction().show(fragment).commit();
                }
            }
        });

        Log.i("counter", counter.toString());

    }

    private void updateCounter() {
        counter.incrementCounter();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(KEY_NUMBER,counter);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onFragmentInteraction(int link){
        GreenFragment fragment = (GreenFragment) getSupportFragmentManager().findFragmentById(R.id.fragmenrGreen);
        if (fragment != null && fragment.isInLayout()) {fragment.setText(link);
        }
    }


}
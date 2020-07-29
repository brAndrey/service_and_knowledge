package com.example.orientation_fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.serviceandknowledge.R;

//android:background="@color/white"


public class GreenFragment extends Fragment {
private static final String ITEM_NUMBER="item";
int currentItem;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_green,container,false);

        if(savedInstanceState != null){
            currentItem=savedInstanceState.getInt(ITEM_NUMBER,0);
            Log.i(" GreenFragment "," "+currentItem);
            TextView textView = view.findViewById(R.id.textView);
            textView.setText(Integer.toString(currentItem));
        }


        return view;
    }

    public void setText (int item){
        TextView textView = getView().findViewById(R.id.textView);
        textView.setText(Integer.toString(item));
        currentItem=item;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt(ITEM_NUMBER,currentItem);

        super.onSaveInstanceState(outState);
    }
}

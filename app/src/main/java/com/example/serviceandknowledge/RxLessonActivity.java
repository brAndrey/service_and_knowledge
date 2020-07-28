package com.example.serviceandknowledge;

// нужен для java
import io.reactivex.Observable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RxLessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxlesson);
        Button button = findViewById(R.id.buttonLambda);
        // лямбда выражение
        button.setOnClickListener(view ->doSomething());
        // стандартное выражение
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("Lambda "," λ " );
//            }
//        });
    }

    public void CycleFor(View view) {
        long time= System.currentTimeMillis();

        int[] item = new int[]{1,2,4};
        for (int value : item){
            Log.i("Cycle", String.valueOf(value));
        }



//        List<String > words = new ArrayList<>();
//        words.add("раз");
//        words.add("два");
//        words.add("три");
//
//        for (String word:words){
//            Log.i("",word);
//        }
        //words.stream().map((word)->).reduce(String word->Log.i("",word)); - not work




        Log.i(" Cycle time "," cчитали за "+String.valueOf(System.currentTimeMillis()-time)+" миисекунд");
    }

    public void Rx(View view) {
        long time= System.currentTimeMillis();
        {
            Observable<String> source =
                    Observable.just("Testing", "One", "Two", "Three");
            source.subscribe(s -> Log.e("TAG", "RECEIVED: " + s));

        }
        Log.i(" Rx time "," cчитали за "+ (System.currentTimeMillis() - time) +" миисекунд");
    }

    private void doSomething() {
        Log.i("Lambda ", " λ ");

//
//        Runnable r = new Runnable(){
//            @Override
//            public void run(){
//                Log.i("Lambda ", " λ runnable");
//
//            }
//        };
//
//        Thread thread = new Thread(r);
//        thread.start();

        // поток с лямбдой
        Runnable runnable = ()->Log.i("Lambda ", " λ runnable");
        new Thread(runnable).start();


        // поток без лямбды
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("Lambda ", " λ thread");
            }
        });
        thread.start();

    }






}

package com.example.serviceandknowledge;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServisClass {

    public static String ArreyToString(String[] arrey){
        String rez = "";
        for (String num : arrey) {
            rez = rez+" "+num;
        }
        return rez;
    }

    public static String ArreyToString(ArrayList<Object > arrayList){
        String rez = "";
        int i;
        for ( i=0; i<=arrayList.size();i++) {
          Object  num=arrayList.get(i);
            rez = rez+" "+num.toString();
        }
        return rez;
    }
    public static String ArreyToString(List<Integer> List){
        String rez = "";
        int i;
        if (List.size()>0){
        for ( i=0; i<=List.size();i++) {
            Integer  num=List.get(i);
            rez = rez+" "+num.toString();
        }
        return rez;}
        else return null;
    }

    public static String currentDateandTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss");
        String currentDateandTime = sdf.format(new Date());
        return currentDateandTime;
    }
    /*
    long time= System.currentTimeMillis();
     Log.i(" loadWeather ",cityName+ " Считали за "+String.valueOf(System.currentTimeMillis()-time)+" миисекунд");
     
     */
}

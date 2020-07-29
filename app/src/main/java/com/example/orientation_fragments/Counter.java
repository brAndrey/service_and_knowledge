package com.example.orientation_fragments;

import android.os.Parcel;
import android.os.Parcelable;

import java.security.SecureRandom;

public class Counter implements Parcelable {

    private int currentNumber = 0;

    private boolean someBoolean;
    private String someString;

    public Counter() {
        SecureRandom secureRandom = new SecureRandom();

        someBoolean = secureRandom.nextBoolean();
        someString = "Test" + secureRandom.nextInt();
    }

    protected Counter(Parcel in) {
        currentNumber = in.readInt();
        someBoolean = in.readByte() != 0;
        someString = in.readString();
    }

    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

    public int getCurrentNumber() {
        return currentNumber;
    }

    public boolean isSomeBoolean() {
        return someBoolean;
    }

    public String getSomeString() {
        return someString;
    }

    public void incrementCounter() {
        currentNumber++;
        SecureRandom secureRandom = new SecureRandom();
        someBoolean = secureRandom.nextBoolean();
        someString = "Test" + secureRandom.nextInt();
    }

    @Override
    public String toString() {
        return "Counter{" +
                "currentNumber=" + currentNumber +
                ", someBoolean=" + someBoolean +
                ", someString='" + someString + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(currentNumber);
        dest.writeByte((byte) (someBoolean ? 1 : 0));
        dest.writeString(someString);
    }
}

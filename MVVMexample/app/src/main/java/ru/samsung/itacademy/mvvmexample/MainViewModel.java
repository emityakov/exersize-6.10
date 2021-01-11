package ru.samsung.itacademy.mvvmexample;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> liveData;

    public MutableLiveData<String> getRandomNumber() {

        if (liveData == null) {
            liveData = new MutableLiveData<>();

            generateRandomNumber();
        }
        return liveData;
    }

    public void generateRandomNumber() {
        int randomNumber = new Random().nextInt(61) + 20;
        liveData.setValue(String.valueOf(randomNumber));
        Log.v("generateRandomNumber", "randomNumber : "+randomNumber);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        liveData = null;
    }
}

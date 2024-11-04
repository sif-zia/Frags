package com.example.frags;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    MutableLiveData<String> string = new MutableLiveData<>();

    public void setString(String str) {
        string.setValue(str);
    }

    public LiveData<String> getString() {
        return string;
    }
}

package com.bmharwani.navegationdeber.ui.print;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrintViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public PrintViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hola quiero estar Zzzzzz");
    }

    public LiveData<String> getText() {
            return mText;
        }

}

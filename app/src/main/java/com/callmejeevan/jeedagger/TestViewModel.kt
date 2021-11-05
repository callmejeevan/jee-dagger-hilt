package com.callmejeevan.jeedagger

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String1") testString: String
) : ViewModel() {

    init {
        Log.d("ViewModel", "Test string from ViewModel : $testString")
    }
}
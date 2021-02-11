package com.assingment.android.view.quiz

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.assingment.android.model.Data
import com.assingment.android.model.Quiz

class QuizViewModel: ViewModel() {

    val quizes = MutableLiveData<List<Quiz>>()
    var page = 0

    init {
        quizes.value = Data.quizes
    }
}

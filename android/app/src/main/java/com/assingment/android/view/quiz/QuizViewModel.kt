package com.assingment.android.view.quiz

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.assingment.android.model.Data
import com.assingment.android.model.Quiz

class QuizViewModel: ViewModel() {

    val quizzes = MutableLiveData<List<Quiz>>()
    var page = 0

    init {
        quizzes.value = Data.quizzes
    }
}

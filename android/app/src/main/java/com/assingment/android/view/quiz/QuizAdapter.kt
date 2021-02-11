package com.assingment.android.view.quiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assingment.android.R
import com.assingment.android.model.Quiz
import com.assingment.android.view.ShareViewModel

class QuizAdapter(private val quizes: List<Quiz>, private val model: ShareViewModel) :
    RecyclerView.Adapter<QuizAdapter.ViewHolder>() {

    override fun getItemCount(): Int = quizes.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_quiz, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(quizes[position], model)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val question: TextView = view.findViewById(R.id.question)
        private val choices: RadioGroup = view.findViewById(R.id.choices)

        fun bind(quiz: Quiz, model: ShareViewModel) {
            question.text = quiz.question
            quiz.choices.forEachIndexed { i, q ->
                (choices.getChildAt(i) as RadioButton).text = q
            }
            choices.setOnCheckedChangeListener { radioGroup, i ->
                val checked = radioGroup.findViewById<RadioButton>(i)
                val correct = checked.text == quiz.answers
                if (correct) {
                    model.score = model.score + 1
                }
            }
        }

    }
}

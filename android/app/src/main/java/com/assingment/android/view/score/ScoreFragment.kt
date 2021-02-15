package com.assingment.android.view.score

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.assingment.android.R
import com.assingment.android.view.ShareViewModel

class ScoreFragment: Fragment() {

    private val layoutId: Int = R.layout.fragment_score

    private val model: ShareViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = view.findViewById<TextView>(R.id.name)
        val score = view.findViewById<TextView>(R.id.score)
        val ctaButton = view.findViewById<Button>(R.id.ctaButton)
        name.text = model.name.value
        score.text = model.score.toString()

        ctaButton.setOnClickListener{
            findNavController().navigate(R.id.action_scoreFragment_to_homeFragment)
            model.score = 0
        }

    }
}

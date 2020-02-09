package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica_app.*

class LogicaAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica_app)
        btnSubmit.setOnClickListener { onSubmit() }
    }

    var correctAnswers = 0
        get() {
            var correctAnswers = 0
            if (answerOne.text.toString() == getString(R.string.text_true))
                correctAnswers++
            if (answerTwo.text.toString() == getString(R.string.text_false))
                correctAnswers++
            if (answerThree.text.toString() == getString(R.string.text_false))
                correctAnswers++
            if (answerFour.text.toString() == getString(R.string.text_false))
                correctAnswers++
            return correctAnswers
        }

    private fun onSubmit(){
        Toast.makeText(this, getString(R.string.correct_answer_toast, correctAnswers), Toast.LENGTH_LONG).show()
    }
}

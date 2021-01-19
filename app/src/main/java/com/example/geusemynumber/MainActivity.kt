package com.example.geusemynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question_text_view.text = resources.getString(R.string.first_question)
    }

    fun arrowDown (view: View){
      if(number == 5){
          number = 3
          question_text_view.text = resources.getText(R.string.second_question)
      }else if(number == 3){
          number = 2
          question_text_view.text = resources.getText(R.string.third_question)
      }else if(number == 2){
          number = 1
          question_text_view.text = resources.getText(R.string.fourth_question)
      }else if(number == 7){
          number = 6
          question_text_view.text = resources.getText(R.string.seventh_question)
      }else if(number == 9){
          number = 8
          question_text_view.text = resources.getText(R.string.nineth_question)
      }
    }

    fun arrowUp(view: View){
      if(number == 3){
          number = 4
          question_text_view.text = resources.getText(R.string.fifth_question)
      }else if(number == 5){
          number = 7
          question_text_view.text = resources.getText(R.string.sixth_question)
      }else if(number == 7){
          number = 9
          question_text_view.text = resources.getText(R.string.eight_question)
      }else if(number == 9){
          number = 10
          question_text_view.text = resources.getText(R.string.tenth_question)
      }
    }

    fun successFunction(view: View){
        success_text_view.visibility = View.VISIBLE
        question_text_view.visibility = View.INVISIBLE
        targetedNumber.text = String.format(resources.getString(R.string.target_number_text_view), number)
        targetedNumber.visibility = View.VISIBLE
    }
    fun resetGame(view: View){
        question_text_view.text = resources.getText(R.string.first_question)
        success_text_view.visibility = View.INVISIBLE
        targetedNumber.visibility = View.INVISIBLE
        number = 5
       // targetedNumber.text = String.format(resources.getString(R.string.target_number_text_view), number)
        question_text_view.visibility = View.VISIBLE
    }
}
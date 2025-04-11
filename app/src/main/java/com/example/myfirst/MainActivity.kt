package com.example.myquizapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var tvQuestion: TextView? = null
    private var ivFlag: ImageView? = null
    private var pbQuizProgress: ProgressBar? = null
    private var tvQuizProgress: TextView? = null
    private var tvOptionOne: TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        tvQuestion = findViewById(R.id.tv_question)
        ivFlag = findViewById(R.id.iv_country)
        pbQuizProgress = findViewById(R.id.pb_quiz_progress)
        tvQuizProgress = findViewById(R.id.tv_quiz_progress)
        tvOptionOne = findViewById(R.id.tv_option_one)
        btnSubmit = findViewById(R.id.btn_submit)

        btnSubmit?.setOnClickListener {
            // Add logic to handle submission
        }
    }
}

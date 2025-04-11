package com.example.myquizapplication

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val q1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )

        val q2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany", "Belgium", "Brazil", "Bhutan",
            2
        )

        questionList.add(q1)
        questionList.add(q2)

        return questionList
    }
}

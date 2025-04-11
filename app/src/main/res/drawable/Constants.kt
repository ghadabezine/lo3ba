package drawable

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "France", "Italy", "Spain",
            1
        )

        val question2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            "USA", "France", "Canada", "Mexico",
            2
        )

        val question3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_japan,
            "China", "Japan", "South Korea", "Vietnam",
            2
        )

        questionList.add(question1)
        questionList.add(question2)
        questionList.add(question3)

        return questionList
    }
}

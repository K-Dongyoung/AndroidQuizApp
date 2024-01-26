package com.practice.myquizapp

object Constants {

    fun getQuestion():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            correctAnswer = 2
        )
        questionsList.add(que2)

        val que3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Brazil",
            "Fiji",
            "Armenia",
            "Belgium",
            correctAnswer = 4
        )
        questionsList.add(que3)

        val que4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Fiji",
            "Armenia",
            "Denmark",
            correctAnswer = 1
        )
        questionsList.add(que4)

        val que5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Germany",
            "Fiji",
            "Armenia",
            "Denmark",
            correctAnswer = 2
        )
        questionsList.add(que5)

        val que6 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Armenia",
            "Fiji",
            "Denmark",
            "Germany",
            correctAnswer = 3
        )
        questionsList.add(que6)

        val que7 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Armenia",
            "India",
            "Kuwait",
            "Germany",
            correctAnswer = 4
        )
        questionsList.add(que7)

        val que8 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Armenia",
            "Kuwait",
            "India",
            "New Zealand",
            correctAnswer = 3
        )
        questionsList.add(que8)

        val que9 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Armenia",
            "Canada",
            "Kuwait",
            "New Zealand",
            correctAnswer = 3
        )
        questionsList.add(que9)

        val que10 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Canada",
            "Egypt",
            "Armenia",
            correctAnswer = 1
        )
        questionsList.add(que10)

        return questionsList

    }
}
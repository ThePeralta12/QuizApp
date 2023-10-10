package eu.tutorials.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()


        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.countyflag1,
            "Clare",
            "Dublin",
            "Donegal",
            "Cork",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.countyflag2,
            "Derry",
            "Kildare",
            "Westmeath",
            "Down",
            4
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.countyflag3,
            "Galway",
            "Louth",
            "Meath",
            "Limerick",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.countyflag4,
            "Antrim",
            "Wicklow",
            "Waterford",
            "Mayo",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.countyflag5,
            "Derry",
            "Down",
            "Fermanagh",
            "Tyrone",
            4
        )
        questionList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.countyflag6,
            "Wexford",
            "Carlow",
            "Mayo",
            "Offaly",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.countyflag7,
            "Longford",
            "Roscommon",
            "Meath",
            "Laois",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.countyflag8,
            "Wexford",
            "Tipperary",
            "Sligo",
            "Armagh",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.countyflag9,
            "Kerry",
            "Dublin",
            "Limerck",
            "Letrim",
            2
        )
        questionList.add(que9)

        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.countyflag10,
            "Kilkenny",
            "Wexford",
            "Mayo",
            "Kildare",
            1
        )
        questionList.add(que10)

        return questionList
    }


}
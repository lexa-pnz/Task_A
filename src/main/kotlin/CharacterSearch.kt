class CharacterSearch {

    private val charSearchList: ArrayList<String> = arrayListOf()

    fun charSearch(list: ArrayList<String>): ArrayList<String>{

        val numberRows = searchNumberRows(list)

        for (item in 1 .. numberRows) {
            val line:String = list[item]

            var counter = 0
            for (i in line.indices) {
                for (j in i until line.length - 1) {
                    if (line[i] == line[j+1])
                        counter++
                }
            }

            if (counter == NUMBER_OF_LETTER_REPETITIONS)
                charSearchList.add(TEXT_WITH_THE_CORRECT_LINE)
            else
                charSearchList.add(TEXT_WITH_THE_WRONG_LINE)
        }

        return charSearchList
    }

    private fun searchNumberRows(list: ArrayList<String>):Int{
        var parsedInt = list.size - 1

        try {
            parsedInt = list[0].toInt()
        } catch (e: NumberFormatException) {
            println(e)
        }
        return parsedInt
    }

}

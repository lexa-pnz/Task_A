class CheckingInputFile {

    fun checkInputFile(list: ArrayList<String>):Boolean{
        return checkCountRows(list) && checkLettersAlf(list) && checkCountLetters(list)
    }

    private fun checkCountRows(list: ArrayList<String>):Boolean{

        return try {
            val parsedInt = list[0].toInt()
            return parsedInt in CHECKING_LINES_WITH..CHECKING_LINES_BY && parsedInt < list.size
        } catch (e: NumberFormatException) {
            println(e.message)
            false
        }
    }

    private fun checkLettersAlf(list: ArrayList<String>):Boolean{

        var line = ""
        for (i in 1 until list.size) {
            line += list[i]
        }

        var alfCheck = 0
        for (i in line.indices){
            for(j in LATIN_CAPITAL_ALPHABET.indices){
                if (line[i] == LATIN_CAPITAL_ALPHABET[j])
                    alfCheck++
            }
        }

        return alfCheck == line.length
    }

    private fun checkCountLetters(list: ArrayList<String>):Boolean{

        var checkCountLet = true
        for (i in 1 until list.size) {
            if (list[i].length != NUMBER_OF_LETTERS_PER_LINE)
                checkCountLet = false
        }

        return checkCountLet
    }
}
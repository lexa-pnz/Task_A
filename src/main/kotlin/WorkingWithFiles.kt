import java.io.File

class WorkingWithFiles {

    fun readFile(fileName: String):Boolean{
        val checkingInputFile = CheckingInputFile()

        return try {
            File(fileName).forEachLine { stringList.add(it) }

            return checkingInputFile.checkInputFile(stringList)
        } catch (e:Exception){
            println(e.message)
            false
        }
    }

    fun writeFile(fileName: String, list: ArrayList<String>):Boolean{

        var writeFileText = ""
        for (item in list) {
            writeFileText = writeFileText + item + "\n"
        }

        return try{
            val newFile = File(fileName)
            newFile.writeText(writeFileText)
            true
        } catch (e: Exception){
            println(e.message)
            false
        }
    }
}
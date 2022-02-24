val stringList: ArrayList<String> = arrayListOf()

fun main(args: Array<String>) {
    val charSearchList: ArrayList<String>

    val workingWithFiles = WorkingWithFiles()
    val utils = Utils()
    val characterSearch = CharacterSearch()

    if (workingWithFiles.readFile(NAME_INPUT_FILE)) {
        charSearchList = characterSearch.charSearch(stringList)

        if (workingWithFiles.writeFile(NAME_OUTPUT_FILE, charSearchList))
            utils.printList(charSearchList)
        else
            println(ERR_MESSAGE_FOR_OUTPUT_FILE)
    }
    else
        println(ERR_MESSAGE_FOR_INPUT_FILE)
}
import java.util.Scanner
class SelectionMenuScreen() {
    fun Start()
    {
        selectionMenu(ARCHIVE)
    }

    //архивы, список
    var archives: MutableMap<Int, Archive> = mutableMapOf()
    var numOfArchive: Int = null

    companion object objects
    {
        const val NOTE: Int = 0
        const val ARCHIVE: Int = 1
    }
    //тут будут храниться слова для структур, которые будут в приложении.
    val words: MutableMap<Int, ArrayList<String>> =
        mapOf(objects.NOTE to listOf("заметок", "заметку","моя","созданная", "заметка", "заметки"),
            objects.ARCHIVE to listOf("архивов", "архив","мой","созданный", "архив", "архива"))
    //считывает выбор пункта меню и возвращает результат

    fun showArchives()
    {
        println(archives.map{ "${it.key} ${it.value}" }.joinToString("\n"))

    }
}

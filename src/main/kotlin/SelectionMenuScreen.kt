import java.util.Scanner
class SelectionselectionMenuScreen {

    //заметки
    var notes: MutableMap<Int, String>()
    //архивы
    var archives: MutableMap<Int, String>()

    const val NOTE = 0
    const val ARCHIVE = 1

    //тут будут храниться слова для структур, которые будут в приложении.
    //с такой структурой будет удобнее добавлять в приложение новую структуру при желании
    val words = mapOf(NOTE to listOf("заметок", "заметку","моя","созданная", "заметка"),
        ARCHIVE to listOf("архивов", "архив","мой","созданный", "архив"))

    //считывает выбор пункта меню и возвращает результат
    fun readingUserInput(): Int
    {
        while (true)
        {
            when ()
            {
                //Выбор элемента из списка и создание объекта.
                CREATEOBJ ->
                {
                    println("Введите название объекта")
                    var newInput: Int? = Scanner(System.`in`).nextLine().toIntOrNull()
                    if (newInput.isNullOrBlank())
                    {
                        println("Пустой ввод недопустим! Сохранение невозможно.")
                    }
                }

                //Выбор архива, выбор заметки, экран заметки — это меню выбора.
                SELECTIONselectionMenu -> {
                    var newInput: Int? = Scanner(System.`in`).nextLine().toIntOrNull()
                    //если есть буквы или символы
                    if (!newInput!!.all { char -> char.isDigit() })
                    {
                        println("Следует ввести цифру")
                        continue
                    }
                    //если нет в списке
                    else if (not newInput.toInt() in list)
                    {
                        println("Такой цифры нет")
                        continue
                    }
                    else
                        return newInput
                }
            }

        }
    }

    fun reactToInput(inp: Int)
    {
        when(inp)
        {
            0 -> {

            }
            1 ->
            {

            }
            2 ->
            {

            }
        }
    }
    fun selectionMenu(numberOfStructure: Int)
    {
        println(
        """
        Список $(words[numberOfStructure][0]): 
        0. Создать $(words[numberOfStructure][1])
        1. Это $(words[numberOfStructure][2]) уже $(words[numberOfStructure][3]) $(words[numberOfStructure][4])
        2. Выход
        """)
        
    }

    fun selectionObj(numberOfStructure: Int)
    {
        when (numberOfStructure)
        {
            NOTE -> println(notes.map{ "${it.key} ${it.value}" }.joinToString("\n"))
            ARCHIVE -> println(archives.map{ "${it.key} ${it.value}" }.joinToString("\n"))
        }
    }
}

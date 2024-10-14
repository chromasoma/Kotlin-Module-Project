import java.util.Scanner
class SelectionselectionMenuScreen<T> {

    //архивы, список
    var archives: MutableMap<Int, Archive> = mutableMapOf()

    //тут будут храниться слова для структур, которые будут в приложении.
    val words = mapOf(NOTE to listOf("заметок", "заметку","моя","созданная", "заметка", "заметки"),
        ARCHIVE to listOf("архивов", "архив","мой","созданный", "архив", "архива"))

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
                    println("Введите название ")

                    while (true)
                    {
                        var newInput: Int? = Scanner(System.`in`).nextLine().toIntOrNull()
                        if (newInput.isNullOrBlank())
                            {
                                println("Пустой ввод недопустим! Повторите попытку.")
                            }
                        else
                            break
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

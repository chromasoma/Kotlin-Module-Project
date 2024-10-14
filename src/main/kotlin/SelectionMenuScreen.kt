import java.util.Scanner
class SelectionMenuScreen {

    //заметки
    var notes: MutableList<String>

    const val NOTE = 0
    const val ARCHIVE = 1

    //архивы
    var archives: MutableList<String>

    //тут будут храниться слова для структур, которые будут в приложении.
    //с такой структурой будет удобнее добавлять в приложение новую структуру при желании
    val words = mapOf(NOTE to listOf("заметок", "заметку","моя","созданная", "заметка"),
        ARCHIVE to listOf("архивов", "архив","мой","созданный", "архив"))

    fun readingUserInput(MutableList<String>): String?
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
                SELECTIONMENU -> {
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
    fun menu(numberOfStructure: Int)
    {
        println(
        """
        Список $(words[numberOfStructure][0]): 
        0. Создать $(words[numberOfStructure][1])
        1. Это $(words[numberOfStructure][2]) уже $(words[numberOfStructure][3]) $(words[numberOfStructure][4])
        2. Выход
        """)
        
    }
}
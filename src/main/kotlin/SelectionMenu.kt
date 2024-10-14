import java.util.Scanner
class SelectionMenu {

    //заметки
    var notes: MutableList<String>

    //архивы
    var archives: MutableList<String>

    //тут будут храниться слова для структур, которые будут в приложении.
    //с такой структурой будет удобнее добавлять в приложение новую структуру при желании
    val words = mutableMapOf<Int, MutableList<String>>()

    fun readingUserInput(MutableList<String>): String?
    {
        while (true)
        {
            var newInput: Int? = Scanner(System.`in`).nextLine().toIntOrNull()

            var variableName:String? = readLine()
            //если есть буквы или символы
            if (!variableName!!.all { char -> char.isDigit() })
            {
                println("Следует ввести цифру")
                continue
            }
            //если нет в списке
            else if (not variableName.toInt() in list)
            {
                println("Такой цифры нет")
                continue
            }
            else
                return variableName
        }
    }
    fun menu(itIsNote: Boolean)
    {
        if (itIsNote)
            println(
            """
            Список заметок: 
            0. Создать заметку
            1. Это моя уже созданная заметка
            2. Выход
            """)
        else
            println(
            """                
            Список архивов: 
            0. Создать архив
            1. Это мой уже созданный архив
            2. Выход
            """)




        
    }
}
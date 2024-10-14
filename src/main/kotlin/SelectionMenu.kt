import java.util.Scanner
class SelectionMenu {


    fun readingUserInput(MutableList<String>)
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
    fun menu(mutableList: MutableList<String>)
    {
        println(
        """
        Список архивов: 
        0. Создать архив
        1. Это мой уже созданный архив
        2. Выход
        
        Список заметок: 
        0. Создать заметку
        1. Это моя уже созданная заметка
        2. Выход
        """
        )

        val list: MutableList<String> = mutableListOf("0", "1", "2")

        list ->
        
    }
}
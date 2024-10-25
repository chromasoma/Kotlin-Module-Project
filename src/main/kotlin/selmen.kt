fun selectionMenu(numberOfStructure: Int = ARCHIVE)
{
    println(
        """
        Список $(words[numberOfStructure][0]): 
        0. Создать $(words[numberOfStructure][1])
        1. Это $(words[numberOfStructure][2]) уже $(words[numberOfStructure][3]) $(words[numberOfStructure][4])
        2. Выход
        """)
    while (true)
    {
        var inp: Int = readingUserInput()
        if (numberOfStructure == objects.ARCHIVE)
        {
            if (inp == 0)
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

                var a: Archive = Archive(newInput)
                archives.add(a)
                println("Архив создан!")
            }
            else if (inp == 1)
            {
                showArchives()
                var newInput: Int? = Scanner(System.`in`).nextLine().toIntOrNull()
                //если есть буквы или символы
                if (!newInput!!.all { char -> char.isDigit() })
                {
                    println("Следует ввести цифру")
                    continue
                }
                //если нет в списке
                else if (not newInput.toInt() in archives.keys)
                {
                    println("Такой цифры нет")
                    continue
                }
                else
                {
                    //начинаем выбор заметки
                    selectionMenu(NOTE)
                }
            }
            else if(inp == 2)
            {
                return
            }
            else
            {
                println("Нет такого пункта меню. Попробуйте еще раз.")
                continue()
            }
        }
        else if (numberOfStructure == objects.NOTE)
        {
            if (inp == 0)
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

                //----------
                var note: Note = Note(newInput)
                archives[numOfArchive].addNote(a)
                println("Архив создан!")
            }
            else if (inp == 1)
            {
                showArchives()
                var newInput: Int? = Scanner(System.`in`).nextLine().toIntOrNull()
                //если есть буквы или символы
                if (!newInput!!.all { char -> char.isDigit() })
                {
                    println("Следует ввести цифру")
                    continue
                }
                //если нет в списке
                else if (not newInput.toInt() in archives.keys)
                {
                    println("Такой цифры нет")
                    continue
                }
                else
                {
                    //начинаем выбор заметки
                    selectionMenu(NOTE)
                }
            }
            else if(inp == 2)
            {
                selectionMenu(ARCHIVE)
            }
            else
            {
                println("Нет такого пункта меню. Попробуйте еще раз.")
                continue()
            }
        }
    }
}
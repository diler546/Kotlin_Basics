fun main() {
    var string: String = ""
    //"AAADSSSRRTTHAAAA"
    var check = true
    println("Программма считает идущие подряд одинакамые символы в введённой строке")
    while (check) {
        print("Введите строку: ")
        string = readln()
        if (string == "") {
            println("Строка пустая. Введите строку которая состоит из каких-нибуть символов")
        } else {
            check = false
        }
    }
    var sumbol: Char = string[0]
    var new_string = Array(size = 100) { "" }
    var count = 1
    var j = 0 //индекс нового массива
    for (i in string.indices) {

        if (i == string.length - 1) //если последний
        {
            new_string[j] = " $sumbol "
            if (count != 1) new_string[j + 1] = "->$count' "
        } else if (sumbol == string[i + 1]) {
            count++;
        } else {
            new_string[j] = " $sumbol "
            if (count != 1) new_string[j + 1] = "->'$count' "
            j += 2
            sumbol = string[i + 1]
            count = 1
        }
    }
    println("В ковычках количество одинаковых символов подряд")
    print("Ответ: ")
    new_string.forEach { print(it) }
}


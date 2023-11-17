fun main() {
    //"AAADSSSRRTTHAAAA"
    var string:String=""
    var check=true
    println("Программма подсчитывает количество различных символов во введенной строке")
    while (check) {
        print("Введите строку: ")
        string = readln()
        if (string == "") {
            println("Строка пустая. Введите строку которая состоит из каких-нибуть символов")
        } else {
            check = false
        }
    }

    val map = mutableMapOf<Char, Int>()
    var count = 0

    for (i in string.indices){

        val sumbol = string[i]
        for (j in i until string.length) {
            if (sumbol == string[j])
                count += 1
        }

        if (sumbol !in map)
            map[sumbol] = count

        count = 0
    }

    for (i in map.toSortedMap().keys){
        println("$i - ${map[i]}")
    }
}


fun main(){
    println("Программма преобразует введенное натуральное число из 10-ичной системы в двоичную")
    var int:String=""
    var check=true
    while (check) {
        print("Введите натуральное число: ")
        int = readln()
        try {
            var newint: Int = int.toInt()
            if (int == "") {
                println("Строка пустая.")
            }
            else if(newint <= 0){
                    println("Введите положительное число")}
            else {
                check = false
            }
        }
        catch (e:NumberFormatException){
            println("Введите число")
        }
    }
    var newint: Int = int.toInt()
    var newbinary = newint.toString(2)
    println("Ваше число $int в двоичной сиситеме счисления:$newbinary")
}
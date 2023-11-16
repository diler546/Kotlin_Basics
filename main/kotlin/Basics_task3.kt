fun main(){
    print("Введите натуральное число: ")
    var int = readln()
    var newint: Int = int.toInt()
    if(newint < 0 && int == ""){
        println("Введите положительное число")
        return
    }
    var newbinary =newint.toString(2)
    println("Ваше число $int в двоичной сиситеме счисления:$newbinary")
}
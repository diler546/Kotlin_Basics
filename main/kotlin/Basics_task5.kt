import kotlin.math.log
import kotlin.math.round
/*
Создать приложение, с помощью которого пользователь, введя целое число n и основание степени x узнает, существует ли
целочисленный показатель степени y для которого выполняется равенство xy = n. В случае, если показатель существует – вычислить его и вывести.
 В противном случае вывести текст – «Целочисленный показатель не существует».
 */
fun main() {
    var n:Int=0
    var x:Double=0.0
    var check=true
    println("Программма подсчитывает степень y для которого выполняется равенство x^y = n")
    while (check) {
        print("Введите целое число n:")
        try {
             n = readln().toInt()
            print("Введите основание x:")
             x = readln().toDouble()
                check = false
        }
        catch (e:NumberFormatException){
            println("Введите число")
        }
    }
    var y: Double=log(n.toDouble(), x)
    if (round(y) == y) {
        println("y=${round(y).toInt()}")
    } else {
        println("Целочисленный показатель не существует")
    }
}
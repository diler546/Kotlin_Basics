import kotlin.math.log
import kotlin.math.round
/*
Создать приложение, с помощью которого пользователь, введя целое число n и основание степени x узнает, существует ли
целочисленный показатель степени y для которого выполняется равенство xy = n. В случае, если показатель существует – вычислить его и вывести.
 В противном случае вывести текст – «Целочисленный показатель не существует».
 */
fun main() {
    print("Введите целое число n:")
    var n = readln().toDouble()
    print("Введите основание x:")
    var x = readln().toDouble()
    var y: Double=log(n, x)
    if (round(y) == y) {
        println("y=${round(y).toInt()}")
    } else {
        println("Целочисленный показатель не существует")
    }
}
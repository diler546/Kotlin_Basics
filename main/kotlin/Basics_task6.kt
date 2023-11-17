/*
Cоздать приложение, в котором пользователь вводит две различных цифры.
На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
 Результат выводится в консоль. При невозможности создать нечетное число выводится сообщение
 – «Создать нечетное число невозможно». Каждое число вводится на отдельной строке
 */
fun main(){
    println("Приложение выдает, если это возможно, из введенных цифр, нечетное число ")
    var data:String=""
    var num1:Int=0
    var num2:Int=0
    var sum:String=""
    var check=true
    while (check) {
        print("Введите первое число: ")
        try {
            num1 = readln().toInt()
            print("Введите второе число: ")
            num2 = readln().toInt()
            if(num1.toString()==" "|| num2.toString()==" "||num1 !in 0..9||num2 !in 0..9){
                println("Не правильный формат")
            }else {
                check = false
            }
        } catch (e: NumberFormatException) {
            println("Не правильный формат")
        }
        catch (e:IndexOutOfBoundsException){
            println("Не правильный формат")
        }
    }
    sum = num1.toString() + num2.toString()
    if (sum.toInt() % 2 == 0) {
        print("Создать нечетное число невозможно")
    } else {
        println(sum)
    }
}
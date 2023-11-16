fun main() {
    println("Это приложение калькулятор. Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание ")
    print("Введите данные в формате {ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ}: ")
    var data = readln()
    var newdata = data.split(" ")
    val num1 = newdata[0].toInt()
    val num2 = newdata[1].toInt()
    val oper = newdata[2]
    when (oper){
        "+"->{
            println(num1 + num2)
        }
        "-"->
        {
            println(num1-num2)
        }
        "*"->{
            println(num1*num2)
        }
        "/"-> {
            if (num2==0) println("На ноль делить нельзя")
                else println(num1/num2)
        }
    }
}
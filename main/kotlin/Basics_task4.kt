fun main() {
    println("Это приложение калькулятор. Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание ")
    var data:String=""
    var check=true
    while (check) {
        print("Введите данные в формате {ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ}: ")
         data = readln()
        try {
            var newdata = data.split(" ")
            val num1 = newdata[0].toInt()
            val num2 = newdata[1].toInt()
            val oper = newdata[2]
            if (data == "") {
                println("Строка пустая.")
            } else {
                check = false
            }
        }
        catch (e:NumberFormatException){
            println("Не правильный формат")
        }
        catch (e:IndexOutOfBoundsException){
            println("Не правильный формат")
        }
    }
    var newdata = data.split(" ")
    val num1 = newdata[0].toInt()
    val num2 = newdata[1].toInt()
    val oper = newdata[2]
    print("Ответ: ")
    when (oper){
        "+"->{
            print(num1 + num2)
        }
        "-"->
        {
            print(num1-num2)
        }
        "*"->{
            print(num1*num2)
        }
        "/"-> {
            if (num2==0) println("На ноль делить нельзя")
                else print(num1/num2)
        }
    }
}
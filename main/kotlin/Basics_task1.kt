fun main() {
    println("Программма считает идущие подряд одинакамые символы в введённой строке")
    print("Введите строку: ")
    var string = readln()
    var sumbol = string[0]
    var new_string= Array(size = 100){""}
    var count =1
    var j=0
   /* println(string.length)*/
    for(i in 0..string.length-1)
    {
        if (i==string.length-1)
        {
            new_string[j]="$sumbol"
            if(count!=1) new_string[j+1]="'$count'"
        }
        else if (sumbol==string[i+1])
        {
            count++;
        }
        else
        {
            new_string[j]="$sumbol"
            if(count!=1) new_string[j+1]="'$count'"
            j+=2
            sumbol=string[i+1]
            count =1
        }
    }
    print("Ответ: ")
    new_string.forEach { print(it) }
}
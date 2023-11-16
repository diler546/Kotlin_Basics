fun main() {
    print("Введите строку: ")
    var string = readln()
//"AAADSSSRRTTHAAAA"
    var new_string = Array(size = 100) { "" }
    var count = 0
    var t = 0
    for (i in string.length)
    {
    for (j in string.length+1){
        if() {
        }
    }
        /*
    for (i in 'A'..'Z'){
        for (j in 0..string.length - 1)
            if (i==string[j])
            {
                count++
            }
            */
        if(count!=0)
        {
            new_string[t]="$i"
            new_string[t+1]="$count"
            t+=2
            count=0
        }
    }
    var j =0
    for (i in 0..new_string.size)
    {
        if(new_string[j]=="")
        {
            return
        }
        println("${new_string[j]} - ${new_string[j+1]}")
        j+=2
    }
}
fun main() {
    print("Введите строку: ")
    var string = readln()
//"AAADSSSRRTTHAAAA"
    var new_string = Array(size = 100) { "" }
    var count = 1
    var t = 0
    for (i in 0..string.length)
    {
    for (j in i+1 until string.length){
        if(string[i]==string[j]) {
            count++
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
            new_string[t]="${string[i]}"
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
        if(new_string[j]==new_string[j+2]){
            j+=2
            continue
        }
        else println("${new_string[j]} - ${new_string[j+1]}")
        j+=2
    }
}
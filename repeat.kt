fun main() {
    var a = 0
    while(a<5){
        println(++a)
    }
    for(i in 0..9)
    {
        print(i)
    }
    for(i in 0..9 step 3)
    {
        print(i)
    }
    for(i in 9 downTo 0)
    {
        print(i)
    }
    for(i in 'a'..'e'){
        print(i)
    }
}
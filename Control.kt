fun main() {
    for(i in 1..10){
        if(i == 3) break
        println(i)
    }
    for(i in 1..10){
        if(i == 3) continue
        println(i)
    }
    println("\n")
    for(i in 1..10){
        for(j in 1..10){
            if(i==1 && j==2) break
            println("1 : $i, j : &j")
        }
    }
    println("\n")
    loop@for(i in 1..10){
        for(j in 1..10){
            if(i==1 && j==2) break@loop
            println("i : &i, j : &j")
        }
    }
}
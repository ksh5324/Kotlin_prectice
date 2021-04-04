fun main() {
    val a:Int=30
    val b:Int=15
    printApple()
    val sum=returnAddTo10()
    println(sum)
}

//사과를 출력하는 함수
fun printApple(){

    println("사과")
}

//1부터 10까지 출력하는 함수
fun returnAddTo10():Int{
    var sum:Int=0
    for(i in 1..10){
        sum += i
    }
    return sum
}

fun f(vararg a:Int){// 가변인자

}

//배열을 입력받아서 합을 반환
fun f1(a:List<Int>):Int{
    var sum:Int=0
    for(i in List){
        sum+=i
    }
    return sum
}
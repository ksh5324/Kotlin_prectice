fun main() {
    /*var a = 11
    if(a>10){
        println("a는 10보다 크다")
    }
    else{
        println("a는 10보다 작거나 같다")
    }
    */
    doWhen(1)
    doWhen("Di")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
}
fun doWhen(a: Any){
    when(a) {
        1 -> println("정수 1입니다")
        "Di" -> println("이것은 Di 문자열 입니다.")
        is Long -> println("Long 타입 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.") // 나머지,, 부등호 불가
    }
    var result = when(a){
        "Di" -> "이것은 Di 문자열 입니다."
        is Long -> "Long 타입 입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건도 만족하지 않습니다." // 값 변환
    }
    println(result)
}
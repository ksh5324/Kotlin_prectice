fun main() {
    var a = P_erson("a", 1997)
    var b = P_erson("b", 2004)
    var c = P_erson("c", 2004)

    a.introduce()
    b.introduce()
    c.introduce()
}
// 인스턴스 클래스를 이용해서 만들어 내는 서로 다른 속성의 객체를 지칭하는 용어
class P_erson(var name: String, val birthYear:Int){ // 생성자
    fun introduce(){
        println("${birthYear}  ${name}")
    }
}

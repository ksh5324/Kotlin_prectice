fun main() {
    var a = Person("a", 1990)
    var b = Person("b", 1997)
    var c = Person("c", 2004)

    var d = Person("d")
    var e = Person("d")
    var f = Person("d")

}

class Person(var name:String, val birthYear:Int){
    init{
        println("${this.birthYear}  ${this.name}")
    } // 매개변수가 없고 반환되는 값이 없는 특별한 함수

    constructor(name:String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    } // 생성자와 같은 역할, constructor함수를 만들경우 반드시 기본 생성자(init)를 호출해야함
}
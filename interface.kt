// 인터페이스
// 추상함수로만 이루어져있는 순수 추상화 기능을 말하는것
// 코틀린에서는 인터페이스 또한 속성, 추상함수, 일반함수 모두 가질수 있다
// 다만 추상함수는 생성자가 가질수 있는 반면 인터페이는 생성자를 가질수 었으며
// 인터페이스에서 구현부가 있는 함수는 open 함수로 간두
// 구현부가 없는 함수는 abstract 함수로 간주 별도에 키워드 필요없음(open, abstract)

fun main() {
    var d = Dog_()
    d.run()
    d.eat()
}

interface Runner{
    fun run()
}

interface Eater{
    fun eat(){
        println("음식을 먹습니다.")
    }
}

class Dog_ : Runner, Eater {// 인터페이스 여러개 상속 가능
    override fun run(){
        println("우다다다 뜁니다")
    }

    override fun eat(){
        println("허겁지겁 먹습니다.")
    }
}
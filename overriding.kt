// 상속: 수퍼클래스에 있는 함수와 같은 이름으로는 서브클래스에서 만들수 없다
// 수퍼클래스에서 허용한다면 오버라이딩이라는 것으로 같은 이름고 형태로 된 함수의 내용을 다시 구현 가능
fun main() {
    var t = a()
    t.eat()
}
open class f{
     open fun eat(){ // 함수 앞에 open이 있을시 재구현 가능
        println("음식을 먹습니다")
    }
}

class a : f()
{
    override fun eat(){
        println("고기를 먹흡니다.")
    }
}
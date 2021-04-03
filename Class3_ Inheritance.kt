fun main() {
    var a = Animal("abc", 5, "개")
    var b = Dog("asd", 5)

    a.introduce()
    b.introduce()
    b.bark()
}

open class Animal (var name: String, var age: Int, var type: String) // open 상속될수 있도록
{
    fun introduce(){
        println("${type} ${name} ${age}")
    }
}
// 서브클래스는 수퍼 클래스에 존재한느 속성과 같은 이름의 속성을 가질수 없음
// 서브클래스가 생성될때 반드시 수퍼클래스의 생성자까지 호출되어야함

class Dog(name:String, age:Int) : Animal(name, age, "개") // : 수퍼 클래스 Animal
{
    fun bark(){
        println("s")
    }
}
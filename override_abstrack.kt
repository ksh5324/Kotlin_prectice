fun main() {
    var r = Rabbit()
    r.eat()
    r.sniff()
}

abstract class Animal_{
    abstract fun eat()
    fun sniff(){
        println("클클")
    }
}

class Rabbit : Animal_(){
    override fun eat(){
        println("당근을 먹습니다.")
    }
}



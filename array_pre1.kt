fun main() {
    val one: Int = 1
    val two: Int = 2
    val three: Int = 3
    val four: Int = 4
    val five: Int = 5

    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)
    val group2 = arrayOf(1,2,3,4,5)
    val group3 = arrayOf(1,2,3.5,"hello") // 타입이 선언되지 않으면 다 넣은수 있음

    var test1 = group1.get(0) // 첫번째 방법
    var test2 = group1.get(4)
    val test3 = group1[0]
    println(test3)

    // 배열의 값을 바꾸는 방법(1)
    group1.set(0, 100)
    println(group1[0])

    // 벼열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])

}

// 배열이 필요한 이유
// -그룸이 필요할때때
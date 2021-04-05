// Collection
// -> list, set, map
// -> 값을 바꿀수 없음 Imutable Collection
// list
fun main() {

    //List -> 중복을 허용한다.
    val numberLsit = listOf<Int>(1,2,3,3)
    println(numberLsit)
    println(numberLsit.get(0))
    println(numberLsit[0])

    // set -> 중복을 허용하지않는다
    // -> 순서가 없다
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }


    // map -> Key,value 방식으로 관리
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    // mutable Collection (변경가능)
    val mNumberList = mutableListOf<Int>(1 ,2,3)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)
    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)

}
fun main(){
    var a: Int = 54321
    var b: Long = a.toLong()
    var intArr = arrayListOf(1, 2, 3, 4, 5)  // 함수 사용 못함 변할수 없읍
    var nullrr = arrayOfNulls<Int>(5)
    val mutableList = mutableListOf<Int>(1,3,5) // 함수 사용 가능
    intArr[2] = 8
    println(intArr[4])
    for(i in intArr)
    {
        println(i)
    }
}
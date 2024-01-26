fun main() {

    val number = 5
    val result = number in 1..5
    //1..5 is upper bound included i.e., 1,2,3,4,5
    println(result)

    val result2 = number in 1 until 5
    //Here it is not upper bound included i.e., 1,2,3,4
    println(result2)
}
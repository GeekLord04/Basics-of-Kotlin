fun main() {

    println(addition(3,4))
    println(addition(4.0,5.6))

    println(addition(b=2,a=1))      //This is called Named Arguments in Kotlin

    //Storing functions in Variables -

}

//Function Overloading starts here
fun addition(a : Int, b : Int) : Int {
    return a + b
}

fun addition(a : Double, b : Double) : Double {
    return a + b
}
//Function Overloading ends here


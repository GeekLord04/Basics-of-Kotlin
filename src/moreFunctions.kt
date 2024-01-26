fun main() {

    println(addition(3,4))
    println(addition(4.0,5.6))

    println(addition(b=2,a=1))      //This is called Named Arguments in Kotlin where we explicity declare the parameters

    //Storing functions in Variables -

    /* In kotlin we can store functions in variables */
    var fn = ::subtraction
    println(fn(2,4))


}

//Function Overloading starts here
fun addition(a : Int, b : Int) : Int {
    return a + b
}

fun addition(a : Double, b : Double) : Double {
    return a + b
}
//Function Overloading ends here

fun subtraction(a : Int , b : Int) : Int{
    return a-b
}


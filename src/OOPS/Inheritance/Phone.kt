package OOPS.Inheritance

fun main(){

}

open class Phone{
    /*
    The open keyword with the class means the class is open for the extension meaning that
    we can create a subclass of that open class.
    In Kotlin, all the classes are final by default meaning that they can not be inherited.
    We will not be able to create a subclass of the class. The compiler will show an error.
    */

    val name : String = ""
    val type : String = ""
    val volume : Int = 10

    fun makeCall() {}
    fun display() {}
    fun powerOff() {}
    fun getDeviceInfo() {}
}
package OOPS.Inheritance

fun main() {

    val oneplus = OnePlus("Smartphone")
    oneplus.display()

    val generalMobile = Mobile("Phone")
    generalMobile.display()
}

open class Mobile(val type : String){

    open val name : String = ""
    open val size : Int = 5                                     //Properties can be declared as open so that it can be overriden in the child class

    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting down")
    open fun display() = println("Simple mobile display")       //functions can be declared as open so that it can be overriden in the child class

}

class OnePlus(typeParam : String) : Mobile(typeParam) {
    override val name: String = "OnePlus mobile"
    override val size : Int = 6

    override fun display(){
        super.display()                     //display function of Parent class is called using the 'super' keyword
        println("This is OnePlus display")
    }

    override fun toString(): String {                   //overriden from the Any class - Parent of every class
        return "OnePlus(name='$name', size=$size)"
    }


}
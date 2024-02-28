package OOPS.AbstractClassesAndInterface


/*

In Kotlin, abstract classes are classes that cannot be instantiated directly, but can only be subclassed.
They are used to provide a common interface and implementation for its subclasses.

In simple words, when we don't have any idea what about the function body of the superclass, we define it as abstract so that
child classes can define that according to their need
 */

fun main(){

    val circle = Circle(4.0)
    print(circle.area())
    circle.display()

}

abstract class Shape{                   //Abstract functions and properties can exist only in abstract class
    var name : String = ""
    abstract open fun area() : Double       //By default abstract methods are open
    abstract fun display()
}

class Circle(val radius : Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius *radius
    }

    override fun display() {
        println("Circle is getting displayed")
    }
}

abstract class Person{                  //Incase we want not to create object of this class, we declare the class as abstract
    fun displayName() {
        println("This is Person")
    }
}


package OOPS.Inheritance

fun main() {

    val child = Child()
    child.parentMethod()
    child.childMethod()

    println(child.childName)

}

open class Parent {
    val name : String = "Parent"

    fun parentMethod() {
        println("This is Parent Class")
    }

    init {
        println("Parent constructor is called")
    }

}

class Child : Parent() {        //Parent's class is inherited
    val childName : String = "$name's child"

    fun childMethod() {
        println("This is child class")
    }

    init{
        println("Child constructor is called")
    }
}
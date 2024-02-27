package OOPS.Polymorphism

/*

- In Kotlin, polymorphism refers to the ability of a function or method to take on
     multiple forms depending on the context in which it is called.
- It is one of the fundamental principles of object-oriented programming.
- Kotlin, being an object-oriented programming language, supports both static and dynamic polymorphism.

- Parent can hold the reference to its child
- Parent can call methods of child classes (which are common)
*/
fun main(){

    val circle : Shape = Circle(4.0)
    val square : Shape = Square(4.0)
    println(circle.area())      //This will not print 0.0
    println(square.area())      //This will not print 0.0

    val shapes = arrayOf(Circle(3.0), Circle(4.0), Square(2.0))
    calculateArea(shapes);

}



open class Shape{
    open fun area() : Double{
        return 0.0
    }
}

class Circle(val radius : Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side : Double) : Shape(){
    override fun area(): Double {
        return Math.pow(side,2.0)
    }
}

fun calculateArea(shapes : Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}
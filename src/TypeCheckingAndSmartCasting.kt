fun main(){

    val circle = Circle(4.0)
    val player = Player("Hari")

    //Type Checking - Checking the type in runtime

    //"is" operator is used for type checking
    if (circle is Circle){
        println("This is Circle")
    }

    println(circle is Shape)        //This will return true because Circle is also a Shape


    //Smart casting
    val arr = arrayOf(circle,player)        //arr is of type Array<Draggable>
    for(obj in arr){
        if (obj is Circle){                     //Smart casting works here because obj is referencing to Draggable
            println(obj.area())                // but all the properties and methods are of Circle class. So kotlin smart cast obj to Circle in compile time
        }
        else{                                  //Smart casting doesn't work here as the compiler is unable to identify the type
            (obj as Player).sayMyName()                      //"as" operator is used for casting
        }
    }

}
interface Draggable {
    fun drag()
}

abstract class Shape : Draggable {
    abstract fun area() : Double
}

class Circle(val radius : Double) : Shape() {
    override fun drag() {
        println("Circle is dragging")
    }

    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Player(val name : String) : Draggable{
    override fun drag() {
        println("$name is dragging" )
    }
    fun sayMyName() = println("My name is - $name ")
}
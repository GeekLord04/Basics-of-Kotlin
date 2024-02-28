package OOPS.AbstractClassesAndInterface

fun main(){
    dragObjects(arrayOf(CircleNew(4.3), SquareNew(4.3), TriangleNew(4.3, 2.4), Player("Hari")))
    /* Player class has no inheritance hierarchy with other but has a similar behaviour drag()
    Therefore interface is added to  solve that problem
    Multiple interfaces can be implemented by a class
    */
}

fun dragObjects(objects : Array<Draggable>){     //Polymorphism is implemented -> Parents can hold the reference of its and can call the methods of its child classes which are common
    for(obj in objects){
        obj.drag()
    }
}


interface Draggable {
    fun drag()
}
abstract class ShapeNew : Draggable {
    abstract fun area() : Double
}

class CircleNew(val radius : Double) : ShapeNew() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging")
    }
}

class SquareNew(val side : Double) : ShapeNew() {
    override fun area(): Double {
        return Math.pow(side,2.0)
    }

    override fun drag() {
        println("Square is dragging")
    }
}

class TriangleNew(val base : Double, val height : Double) : ShapeNew() {
    override fun area(): Double {
        return 0.5 * base * height
    }
    override fun drag() {
        println("Triangle is dragging")
    }
}

class Player(val name :String) : Draggable {
    override fun drag() = println("$name is dragg")
}
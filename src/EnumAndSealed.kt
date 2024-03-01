
fun main(){

    //Enum class usage
    var day = Days.SUNDAY
    println(day)
    println(day.number)

    //Loop

    for (i in Days.values()){
        println(i)
    }

    for (i in Days.values().take(Days.values().size - 3)){      //from 0 till n-3
        day = i
    }

    day.printFormattedDays()


    //Sealed class usage
    val tile1 = Red("Mushroom", 25)
    val tile2 = Red("Fire", 30)
    println("${tile1.points} - ${tile1.type}")

    val tile : Tile = Red("Mushroom",25)
    val points = when(tile){
        is Blue -> tile.points * 2
        is Red -> tile.points * 2
    }
    println(points)

    /*
    Enum -> Restricts value
    Sealed -> Restricts type
     */

}
/*
Enum classes

Enum classes are a convenient way to represent a concrete set of possible values.
Enum constants are instances of an Enum class, the constants can be initialized by passing specific values to the constructor.
 */
enum class Days(val number : Int){
    MONDAY(1),                 //These are objects of Days
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun printFormattedDays(){
        println("Day is $this")
    }
}
/*
Sealed Class -

- A sealed class is a class that can only be subclassed within the same file where it’s declared
- Subclasses must be declared within the same file as the sealed class
- Sealed classes are often used to represent a closed set of classes, such as when defining the different states of a state machine
- Sealed classes are similar to enum classes, but provide more flexibility
- Enum classes represent a fixed set of values, whereas sealed classes can represent a fixed set of classes with additional data and behavior
- To create a sealed class, use the “sealed” keyword before the class declaration
- Sealed classes can have subclasses declared as normal classes within the same file


Sealed class is Abstract class
 */
sealed class Tile
class Red(val type : String, val points : Int) : Tile()
class Blue(val points : Int) : Tile()

/*
Data class is generally used to hold the data

In Java, we need to create the getters and of every property. To simplify this, data classes has been introduced in Kotlin
 */
fun main() {
    //Data class Objects
    println("Data class Objects")
    val r1 = NewPerson(2, "Jay")
    val r2 = NewPerson(2, "Jay")

    println(r1)         // toString is called automatically
    println(r2)
    println(r1.hashCode())
    println(r1 == r2)
/*
Output -
NewPerson(id=2, name=Jay)
NewPerson(id=2, name=Jay)
74304
true
 */

    //Normal class Objects
    println("Normal class Objects")
    val p1 = ClassPerson(1, "John")
    val p2 = ClassPerson(1,"John")
    println(p1)         // toString is called automatically
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)

/*
Output -
ClassPerson@2f4d3709
ClassPerson@4e50df2e
793589513
false
 */


    val r3 = r1.copy(id = 3)            //utility functions of data class, .copy() - > Copy of the object
    println(r3)

    //Componentn functions
    val (id,name) = r1
    println(id)
    println(name)
    println(r1.component1())

}

data class NewPerson(val id: Int, val name :String)
class ClassPerson(val id: Int, val name :String)
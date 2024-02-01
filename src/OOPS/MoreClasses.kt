package OOPS

fun main() {

    val p1 = Person("A",21)
    val p2 = Person("B",16)

    println(p1.canVote())       //This will return true as 21>18
    println(p2.canVote())       //This will return false as 16<18
}

class Person(val name : String, val age: Int){  //properties

    //method
    fun canVote() : Boolean{
        return age>18
    }
}
package OOPS

import java.util.*

fun main() {

    val calc = Calculator()
    println(calc.add(2,4))
    println(calc.multiply(5,2))

    val person = PersonNew("Chirag", 23)
    println(person.name)
    println(person.age)
    person.age = -21
    println(person.age)
}

class Calculator {
    lateinit var message : String       //The “lateinit” keyword in Kotlin as the name
                                        // suggests is used to declare those variables that are
                                        // guaranteed to be initialized in the future.

    fun add(a : Int, b : Int) : Int{
        return a + b
    }
    fun multiply(a : Int, b : Int) : Int{
        return a * b
    }
}

class PersonNew (nameParam : String , ageParam : Int){
    var name : String = nameParam
        get() {                             //Getter
            return field.uppercase()
        }
    var age : Int = ageParam
        set(value) {                //This is setter
            if (value > 0){         //value of ageParam
                field = value       //field is age
            }
            else{
                println("Age can't be negative")
            }
        }

    var email : String? = null
        get() = field
        set(value) {
            field = value
        }

    //The above snippet is the default syntax of getter and setter. It get automatically called.
}
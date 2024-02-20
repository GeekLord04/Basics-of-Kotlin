package OOPS


/*

Class has 2 things - Properties and Methods
Constructor is used when we need to  - Initialize object and provide default values to properties

A constructor is a special member function that is invoked when an object of the class is created primarily to initialize variables or properties. A class needs to have a constructor and if we do not declare a constructor, then the compiler generates a default constructor. Kotlin has two types of constructors:

1. Primary Constructor
2. Secondary Constructor


 */
fun main() {

    var car = Automobile("Car", 4, 7, true)     //Object of primary constructor
    car.AirBags //The property can be defined here
    //init block will be called here

    var car2 = Automobile("new Car",4)        //Object of secondary constructor


    var newPerson = NewPerson("Admin",34) //Values can't be assigned here
    println(newPerson.name + " ka age hai " + newPerson.age)
    println(newPerson.canVote)


}

class Automobile(val name : String, val tyres : Int, maxSeating : Int, hasAirBags : Boolean){     // () -> Primary Constructor, hasAirBags is not a property here

    /*
    The init block will execute immediately after the primary constructor.
    Initializer blocks effectively become part of the primary constructor.
     */
    init {
        println("Init block is created")
    }

    init{
        println("2nd initialiser block is created")
    }
    val AirBags = hasAirBags     //Defined here


    /*
    While creating primary constructor we need to create the object while passing each and every value
    But that's not the case in Secondary constructor. Here while creating an object we can pass only the required values
     */

    constructor(nameParam: String, seatParam : Int) :
            this("Car", 4,seatParam,true)


    fun drive(){}       //method
    fun applyBrakes(){}     //method
}

class Empty{}       //Empty constructor

class NewPerson(nameParam : String, ageParam : Int){
    val name : String = nameParam
    var age : Int = ageParam
    var canVote : Boolean = age > 18        //Evaluated property
}
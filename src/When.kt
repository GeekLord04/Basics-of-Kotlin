fun main() {

    val animal = "Dog"

        /*
    if (animal == "Horse"){
        println("Animal is Horse")
    }
    else if (animal == "Dog"){
        println("Animal is Dog")
    }
    else if (animal == "Cat") {
        println("Animal is Cat")
    }
    else{
        println("Animal not found")
    }
    */

    //Same thing can be achieved using "when" for better readability

    when(animal){

        "Horse" -> println("Animal is Horse")
        "Dog" -> println("Animal is Dog")
        "Cat" -> println("Animal is Cat")
        else -> println("Animal not found")
    }



}
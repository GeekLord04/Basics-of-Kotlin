/*
Arrays
    - An array is a data structure that holds a fixed number of values of the same type or its subtypes.
    - The most common type of array in Kotlin is the object-type array, represented by the Array class.

 */
fun main() {

    var animal = arrayOf("Dog", "Cat", "Lion", "Tiger", "Giraffe")
    var arr = arrayOf(1,2,3)

    //Define Explicity
    var arr1 = arrayOf<Int>(1,2,3)

    //Print the elements in the array
    println("Print the elements in the array")
    for (i in animal){
        println(i)
    }

    //Print elements as well as the indexes
    println("Print elements as well as the indexes")
    for ((i,e) in animal.withIndex()){      //Here i is the index and e is the element in the respective index
        println("$i - $e")
    }

    //Printing or getting element a particular position
    println("Printing or getting element from a particular index")
    println(animal[0])          //Method 1
    println(animal.get(0))      //Method 2

    //Setting the value at a particular index -> set(index, element)
    animal.set(0,"Cow")
    println("New element is at index 0 is " + animal.get(0))

    //Getting the Size of the array
    println(animal.size)
}

/*
Generics are the powerful features that allow us to define classes, methods and properties which are accessible using different data types while keeping a check on the compile-time type safety.
Creating parameterized classes – A generic type is a class or method that is parameterized over types.
We always use angle brackets <> to specify the type parameter in the program.
*/

fun main(){

    val IntObj = IntContainer(3)
    println(IntObj.getValue())

    //Generic
    val genericContainer = Container<Int>(3)
    println(genericContainer.getValue())
    val genericStringContainer = Container<String>("String Type")
    println(genericStringContainer.getValue())

    //List, Map are generic classes
    val list = listOf<String>()

    //vararg
    add(1,2,3,4,5,6)
    add(1,1,1,1,1,1,1,1,1,1)

}

class IntContainer(var data  : Int){
    fun setValue(value : Int){
        data = value
    }

    fun getValue() : Int{
        return data
    }
}
class StringContainer(var data  : String){
    fun setValue(value : String){
        data = value
    }

    fun getValue() : String{
        return data
    }
}

//To avoid repetative declaration of classes of different data types, we declare a generic class where we can pass any data type when required

//Generic class
class Container<T>(var data : T){
    fun setValue(value : T){
        data = value
    }

    fun getValue() : T{
        return data
    }
}

//varargs in kotlin - vararg parameter is a function parameter that accepts a variable number of arguments of the same type.
fun add(vararg values : Int){
    var sum = 0
    for (i in values){
        sum += i
    }
    println(sum)
}
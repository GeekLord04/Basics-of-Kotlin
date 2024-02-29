package OOPS

fun main(){
    MyClass.f()                     //Since companion object is created
    MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject{              // A class can have only 1 companion object
        fun f(){
            println("Hello I'm from object")
        }
    }

    object AnotherObject{
        fun g(){
            println("Hello I'm from object")
        }
    }


}
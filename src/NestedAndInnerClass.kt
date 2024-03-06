fun main(){

    val obj = Outer()
    obj.i

    //object of nested class
    val nested = Outer.Nested()
    nested.test()

    //object of Inner class
    val innerObj = Outer().InnerNested()        //Since we're accessing the property of Outer class we must create the object of Outer class
    innerObj.test()

}

//Nested Class -> A class defined inside a class
class Outer{
    var i = 0
    class Nested{
        fun test(){
            println("I am in nested class" )
            //i = 1     -> This will throw error because it can't access the property of Outer Class
            //This can be resolved using Inner class
        }
    }

    inner class InnerNested{
        fun test(){
            println("I'm in Inner class $i")       //Can access the property of Outer class
        }
    }

}

//For better understanding refer to this - https://youtu.be/0SLGtVSdCu4?si=Jzz9hvJX0jFzj1Ny
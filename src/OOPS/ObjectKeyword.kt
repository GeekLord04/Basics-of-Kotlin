package OOPS


/*
Kotlin provides an easy way to create singletons using the object declaration feature.
For that, object keyword is used.
 */

fun main(){

    println(A.num)
    println(B.p)
    B.test()

    SharingWidget.incrementFbLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.display()

    //Object Expression
    //Anonymous objects - No name to the object

    var testObj = object{
        val x = 10
        fun method(){
            println("I'm object expression")
        }
    }
    testObj.method()

    var obj = object : CloneIt{
        override fun clone() {
            println("Here is the Clone implementation")
        }
    }
    obj.clone()
}

object A{
    val num : Int = 10
}

object B{
    val p : Int = 20
    fun test(){
        println("I'm Object B")
    }
}

object SharingWidget{
    private var twitterLikes = 0        //Private because we do want to change it explicitly
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFbLikes() = fbLikes++
    fun display() = println("fb likes = $fbLikes and twitter likes = $twitterLikes")
}



interface CloneIt {
    fun clone()
}


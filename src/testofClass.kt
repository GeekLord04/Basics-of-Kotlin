fun main(){


    //Type 1
    val interview = Interview(2, "Chirag")        //Object creation of Interview
    interview.printInfo()


    //Type 2
//    var interview = Interview(2,"Chirag").also {
//        it.printInfo()
//    }


    //Type3
//    var interview = Interview(2,"Chirag").apply {
//        this.printInfo()
//    }



}
class Interview(private var item : Int, private var name : String){     //item and name are the constructor
    fun printInfo(){                //Member Function
        println("$item is $name")
    }
}
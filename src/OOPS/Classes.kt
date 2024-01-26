package OOPS
fun main(){

    //Type 1
    val interview1 = Interview(2, "Chirag")        //Object creation of Interview
    val interview2 = Interview(1,"Rahul")

    println(interview1.id)
    println(interview1.name)
    interview1.printInfo()


    println(interview2.id)
    println(interview2.name)
    interview2.printInfo()


}
class Interview(var id : Int, var name : String){     //id and name are properties
    fun printInfo(){                //Methods
        println("Id no.$id is $name")
    }
}
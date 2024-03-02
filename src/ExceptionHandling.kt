/*

Exceptions are problems that occur during the program execution and disrupt the conventional flow.
This can occur due to various reasons like invalid arithmetic operation, a reference to a null object.
Exception handling is the technique to gracefully handle such problems and continue the program execution.

 */
fun main(){
    val arr = arrayOf(1,2,3,4)
    val value = arr[5]              //It will throw an error and application will crash(in real life)
    println("Hello")                //This will not get printed

    //Therefore we'll use try catch

    try {
        val value = arr[5]
    }
    catch (e : Exception){          //Exceptions will get handled here
        println("Exception is $e")
    }
    catch (e : NullPointerException){       //Can add multiple catch block
        println("Null pointer Exception")
    }
    finally {                       //Everytime this block will get executed irrespective of exception
        println("It will get executed everytime")
    }
    println("Hello")


    createUserList(5)
    createUserList(-5)


}
//Throw keyword

fun createUserList(count : Int){
    if(count<0){
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User list created containing $count users")
    }
}


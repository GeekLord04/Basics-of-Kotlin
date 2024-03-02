/*
Kotlin null safety is a procedure to eliminate the risk of null reference from the code.
Kotlin compiler throws NullPointerException immediately if it found any null argument is passed without executing any other statements.
Kotlin's type system is aimed to eliminate NullPointerException form the code.

Kotlin types system differentiates between references which can hold null (nullable reference) and which cannot hold null (non null reference).
Normally,types of String are not nullable.
To make string which holds null value, we have to explicitly define them by putting a ? behind the String as: String?
 */
fun main(){
    var gender = "Male"
    var gender2 : String? = null        //Nullable type
    //var isAdult : Boolean = null        //Will throw Error as Boolean is not written as Boolean?

    //Null checking

    //1st process
    if (gender2 != null) {
        println(gender2.toUpperCase())          //Will not execute as gender 2 is null
    }

    //2nd process -> Safe call
    println(gender2?.toUpperCase())          // safe call operator - ?/

    // Output - null as gender2 is null but interestingly it didn't throw NullPointerException

    //Execute multiple statement using let{}
    gender2.let{
        println("Line 1")
        println("Line 2 $gender2")
        println("$it")                  //it will point to gender2
    }

    //.let also works on non-nullable
    gender.let{
        println("$it")
    }

    //Assigning into a variable
    //Using Elvis operator -> ?:
    var selectedValue = gender2 ?: "NA"         //This means -> if gender2 is null then "NA" is the value assigned to the variable else the value of gender2

    //Not null asserted operator -> !!.
    //make sure to use when we know the value of object is not null else it'll throw error if the object is found as null
    var value = gender2!!.toUpperCase()
}


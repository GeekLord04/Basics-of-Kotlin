fun main() {
    //Range
    println("Simple range")
    for(i in 1..5){
        println(i)
    }
    /* Output - 1 2 3 4 5 */

    //Using step keyword
    println("using step")
    for (i in 1..5 step 2){
        println(i)
    }
    /* Output - 1 3 5 */

    //Using downTo keyword
    println("Using downTo keyword")
    for(i in 5 downTo 1){
        println(i)
    }
    /* Output - 5 4 3 2 1 */

    println("Using downTo keyword and step")
    for (i in 5 downTo 1 step 2){
        println(i)
        println("Value of i is $i")     //This is called String templating
    }


}
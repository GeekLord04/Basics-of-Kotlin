fun main() {
    val sum = add(3,4)
    println(sum)

    evenorodd(23)

    println("using Inline Functions " + (addInline(3,5)))

    println("using Inline Functions with no return type " + (addInlineNoReturn(3,5)))

    println("With argument")
    printLoop(4)

    println("With no argument passed")
    printLoop()
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

fun evenorodd(a : Int)  {       //in kotlin if a function has no return type then by default it has Unit return type
    val result = if (a%2 == 0) "Even" else "Odd"
    println(result)
}

//Inline functions
fun addInline(a:Int, b: Int) : Int = a + b

//Inline functions with no return type
fun addInlineNoReturn(a:Int, b: Int)  = a + b       //Here return type is not explicitly declared because the return type will automatically be Int

//Default Argument
fun printLoop(count : Int = 2){
    for (i in 1..count){
        println(i)
    }
}
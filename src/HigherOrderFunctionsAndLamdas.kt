fun main(){

    //We can store functions in variable in Kotlin
    //This is how we can store functions in variables
    //In Kotlin, functions are considered first-class citizens, which means they can be treated just like any other variable or object
    var fn: (a: Double, b: Double) -> Double = ::sum        //Type explicitly declared
    var fn2 = ::sum
    println(fn(2.0,3.0))
    println(fn2(2.0,3.0))

    //lamda expression -> Anonymous functions which doesn't have a name
    val lambda1 = {x : Int, y : Int -> x+y}
    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2+3
        a           //Last line is the return type of the lambda function. In this case it is Int
    }

    multiLineLambda()
    println(multiLineLambda())

    //Both are similar
    val singleParamLambda = {x : Int -> x*x}
    val lamda2 : (Int) -> Int = {x -> x*x}
    //Simplified expression
    val simplifiedlambda2 : (Int) -> Int = {it*it}

    //Both are similar
    val sayHi = {msg : String -> println("Hello $msg")}
    val sayHi2 : (String) -> Unit = {msg -> println("Hello $msg")}



    //Higher Order Functions
    calculator(4.0,6.0, ::sum)      //Here we've passed sum because sum function declaration matches with the input type of calculator function
    //Using lambda
    calculator(1.0,2.0, { a, b ->
        a + b
    })

    //Better readibility
    calculator(1.0,2.0) { a, b ->
        a + b
    }
}

fun sum(a : Double, b : Double) : Double{
    return a+b
}

//Higher order function -> In Kotlin, a function which can accept a function as parameter or can return a function is called Higher-Order function.
//calculator is a Higher Order Function because it is taking gn as a argument which is function
fun calculator(a : Double, b: Double, gn: (Double, Double) -> Double){
    val result = gn(a,b)
    println(result)
}


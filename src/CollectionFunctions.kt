/*
Get the Idea of Lambda functions first to understand this topic
 */
fun main(){
    val nums = listOf(1,2,3,4,5)
    println(isOdd(nums[2]))

    //filter() of list -> filters the list on the basis of a given condition
    val list = nums.filter(::isOdd)
    println(list)

    val list1 = nums.filter { a : Int -> a%2 != 0 }

    //Can be written in this way too
    val list2 = nums.filter {
        it%2 != 0
    }
    println(list2)

    //Map function of List
    val userList = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C")
    )
    //Maps the data and convert one form to another
    val mapList = nums.map{
        it*it                           //Gets each element and multiples it with itself
    }
    println(mapList)

    //Creates a new data of paid users
    val paidUserList = userList.map{
        PaidUser(it.id,it.name,"Paid")
    }
    println(paidUserList)


    //foreach function -> loops over a list
    nums.forEach{
        println(it)
    }

}

fun isOdd(a: Int) : Boolean{
    return a%2 != 0
}

data class User(val id : Int, val name : String)
data class PaidUser(val id : Int, val name : String, val type : String)
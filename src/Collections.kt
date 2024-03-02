fun main(){
    //Immutable list -> can;t change the element
    val nums = listOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(5))

    //Mutable list -> Can change the element
    val nums2 = mutableListOf(1,2,3)
    nums2.add(52)       //Add elements at last
    println(nums2)
    nums2.add(2,43)     //Add elements at specific position
    println(nums2)
    //Output - [1, 2, 43, 3, 52]

    nums2.remove(52)          //pass the element
    nums2.removeAt(1)          //pass the index
    println(nums2)
    //Output - [1, 43, 3]

    //Add the items from one list to other
    val list  = listOf(11,12)
    nums2.addAll(list)
    println(nums2)






    //Mutable Maps -> Key value pair
    val students = mutableMapOf<Int, String>()
    students.put(1,"Hari")
    students.put(2,"Guddu")
    students.put(3,"Rishabh")

    println(students.get(1))
    println(students.get(11))       //Returns null as key 11 doesn't exist

    //Loop in map
    for((key,value) in students){
        println("$key = $value")
    }

    //Putting values - A different method
    students[8] = "Jones"
    //Getting values
    println(students[8])


    //Immutable Maps
    val map = mapOf(1 to "Hello", 2 to "World")
    println(map)

}
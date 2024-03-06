fun main(){
    val emp = Employee()

    //.apply{}
    emp.age = 20
    emp.name = "John"

    //This can be easily written as - .apply{}
    emp.apply {         //points to emp
        age = 30
        name = "Shane"
    }
    var x = emp.apply {         //x will return Employee
        age = 30
        name = "Shane"
    }


    //.let{}
    println(emp.name)
    println(emp.age)

    //This can be easily written using - .let{}
    emp.let {       //it will point to emp
        println(it.name)
        println(it.age)
    }
    var y = emp.let {       //return value of the scope will be the return value of the last statement of the scope
        println(it.name)
        println(it.age)                 //Unit return
    }

    //with
    with(emp){          //Simply we can access the properties
        age = 30
        name = "Roop"               //Return value will be return value of last statement
    }

    //run{}
    emp.run{            //Directly access the properties - combination of with and let
        age = 35
        name = "Marcero"            //Return value will be the return value of last expression
    }

}

data class Employee(var name : String = "", var age : Int = 18)
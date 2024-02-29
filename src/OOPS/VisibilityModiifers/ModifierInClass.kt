package OOPS.VisibilityModiifers

fun main(){

    val obABC = ABC()
    val test = test()

    test.p
    test.r

    //But s cannot be accessed
}

open class ABC{
    public var p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40        //s is only accessible only in subclasses
}

class test : ABC() {
    fun testFun(){
        println(p)
        //println(q)      //Error because variable q is private
        println(r)
        println(s)
    }
}
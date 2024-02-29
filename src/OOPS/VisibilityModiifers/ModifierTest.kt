package OOPS.VisibilityModiifers

fun main(){
    var a = A()         //As A class is public

    gn()                //As gn() is public

    var b = B()         //As both and files are in the same module (module != package)

//    var c = C()         /*Cannot be accessed as C class is private*/
}
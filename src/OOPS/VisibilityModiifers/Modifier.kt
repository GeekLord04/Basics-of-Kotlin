package OOPS.VisibilityModiifers
/*

*Public Modifier* is the default modifier in Kotlin.
Just like the Java public modifier,
it means that the declaration is visible everywhere.

*Internal* is a new modifier available in Kotlin that’s not there in Java.
Setting a declaration as internal means that it’ll be available in the same module only.
By module in Kotlin, it means a group of files that are compiled together.

*Private Modifiers* do not allow the declarations to be visible outside the current scope.

*Protected Modifier* in Kotlin: CANNOT be set on top-level declarations.
Declarations that are protected in a class, can be accessed only in their subclasses.
 */
fun main(){

}

//Public
class A
var a = 20
fun gn() {

}


//Internal
internal class B

//Private

private class C     //This class can be accessed only within this file Modifier.kt

//Protected

//protected class D    //cannot be used in top level declarations
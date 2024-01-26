fun main(){
    var i = 10
    var j = 11

    var result = i == 10 || j++ == 12

    println(result)
    println(i)
    println(j)
}
/* Output -
10
11
Explanation - [value of j is not printed as 12, this is called Short circuiting because
               when i == 10 is true then j++ == 12 is not evaluated. It is only evaluated when
               i == 11 (i.e., when there is a false condition)]
*/
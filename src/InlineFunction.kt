fun main(){
    calculateTimeAndRun {
        loop(1000000)
    }

    //In Kotlin, classes and object are created for lambdas dynamically and then execute. This leads to poor performance due to high memory consumptions if we create multiple lambdas
    //To improve this, Kotlin has a keyword "inline" . This helps in performance improvement
    //For more clear understanding refer to this video - https://www.youtube.com/watch?v=o9Nvyfc2x5M&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=37&ab_channel=CheezyCode
    
}

inline fun calculateTimeAndRun(fn : () -> Unit){       //Lambda in input
    val start  = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end-start} ms")

}
fun loop(n : Long){
    for(i in 1..n){

    }
}
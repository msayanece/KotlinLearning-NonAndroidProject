

fun testForLoopIncrement(){
    for(a in 1..9){
        println(a)
    }
}

fun testForLoopDecrement(){
    for(a in 9 downTo 1){
        println(a)
    }
}

fun testForLoopIncrementStepped(stepJumpBy: Int){
    for(a in 1..9 step stepJumpBy){
        println(a)
    }
}

fun testForLoopIncrementReversed(){
    val nums = 1..9
    for(a in nums.reversed()){
        println(a)
    }
}

fun testForLoopIncrementUntil(){
    val nums = 1 until 9
    for(a in nums){
        println(a)
    }
}

fun testForLoopIncrementUntilReversed(){
    val nums = 1 until 9
    for(a in nums.reversed()){
        println(a)
    }
}

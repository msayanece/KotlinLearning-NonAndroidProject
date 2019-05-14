
fun ifElseTest(num1: Int, num2: Int) {
    var result: String
    result = if (num1 > num2)
        "IF: $num1 is greater than $num2"
    else if (num2 > num1)
        "ELSE-IF: $num2 is greater than $num1"
    else
        "ELSE: both are equal"
    println(result)
}

fun testWhen(arg: Int): String{
    return when(arg){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Improper input: please give any number from 1 to 4."
    }
}

fun testMultiCaseWhen(arg: Int): String{
    return when(arg){
        1,3,5,7,9 -> "Odd"
        2,4,6,8,10 -> "Even"
        else -> "Improper input: please give any number from 1 to 4."
    }
}

fun testComplexWhen(arg: Int): String{
    return when(val t =testWhen(arg)){
        "One" -> "Odd"
        "Two" -> "Even"
        else -> "Improper input: please give any number from 1 to 4."
    }
}


fun testWhenWithoutCondition(arg: Int): String{
    return when{
        arg == 1 -> "Odd"
        arg == 2 -> "Even"
        else -> "Improper input: please give any number from 1 to 4."
    }
}

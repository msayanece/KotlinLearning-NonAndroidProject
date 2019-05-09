class CreateObjectTest {
    val property1 = "prop1"
    var property2: String? = null

    fun objectFunctionWithDefaultArg(arg1: String = "arg1") {
        println(arg1)
    }

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

    fun stringEquals(s1: String, s2: String): Boolean{
//        return s1.equals(s2)              //same as equals()
        return s1.equals(s2, true)        //same as equalsIgnoreCase()
//        return s1 == s2                     //Intrinsics.areEqual(s1, s2); same as equals()

    }
}
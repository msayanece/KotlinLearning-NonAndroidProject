
//This contains main() method (args: Array<String> is optional in kotlin 1.3)

//14 no video yet to be seen
fun main(){
    //object creation
    val objTest = CreateObjectTest()

    /* //0
    objTest.property2 = "object created: property1 is => ${objTest.property1}"*/

    /*//1
    println(objTest.property2)*/

    /*//2 default args
    objTest.objectFunctionWithDefaultArg()*/

    /*//3 if expression
    ifElseTest(2, 6)*/

    /*//4
    println(stringEquals("asd", "asd"))*/

    /* //5 = null handling
    val objTest2: CreateObjectTest = null       //error CreateObjectTest non-null type
    val objTest2: CreateObjectTest? = null       //no error CreateObjectTest is nullable
    val t1 = objTest2?.property1                     //no error
    val t2 = objTest2!!.property1                     //no error*/

    /*//6 when expression
    println(testWhen(2))*/

    /*//6 complex when expression
    println(testComplexWhen(2))
    testMultiCaseWhen(2)
    testWhenWithoutCondition(2)*/

    /*//7 for loop
    testForLoopIncrement()
    testForLoopDecrement()
    testForLoopIncrementReversed()
    testForLoopIncrementStepped(2)
    testForLoopIncrementUntil()
    testForLoopIncrementUntilReversed()*/

    /*//8 List
    testList()
    testListWithIndex()*/
    /*//Map
    testMap()
    testMapWithTo()*/

    /*// default argument in function
    addition(2,3)
    // named argument in function
    addition(2,3, num4 = 6)*/

    /*//Extension functions for String
    "sayan".pondCase()
    "sayan".reverseAndPondCase()*/
}
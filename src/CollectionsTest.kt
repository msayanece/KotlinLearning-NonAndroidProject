

fun testList(){
    val elements = listOf("a","b","c","d")
    for (element in elements){
        println(element)
    }
}

fun testListWithIndex(){
    val elements = listOf("a","b","c","d")
    for ((index, element)in elements.withIndex()){
        println("$index : $element")
    }
}

fun testMap() {
    val myMap = HashMap<String, Int>()
    myMap["Sayan"] = 28
    myMap["Ayan"] = 25

    for ((key, value) in myMap){
        println("$key : $value")
    }
}

fun testMapWithTo() {
    val myMap = mapOf("Sayan" to 28, "Ayan" to 25)
    for ((key, value) in myMap){
        println("$key : $value")
    }
}

fun String.reverseAndPondCase(): String{
    val resVal: StringBuffer =  StringBuffer();
    val split1 = this.split(" ")
    for (word in split1){
        resVal.append(word.toString().pondCase().reversed())
        resVal.append(" ")
    }
    return resVal.toString()
}


fun String.pondCase(): String{
    val trimmedString = this.trim()
    return trimmedString
        .capitalize()
        .reversed()
        .capitalize()
        .reversed()
}


fun stringEquals(s1: String, s2: String): Boolean{
//        return s1.equals(s2)              //same as equals()
    return s1.equals(s2, true)        //same as equalsIgnoreCase()
//        return s1 == s2                     //Intrinsics.areEqual(s1, s2); same as equals()

}
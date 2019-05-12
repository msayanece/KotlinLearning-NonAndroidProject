import java.util.*
import kotlin.collections.HashMap

class CreateObjectTest {
    val property1 = "prop1"
    var property2: String? = null

    fun objectFunctionWithDefaultArg(arg1: String = "arg1") {
        println(arg1)
    }
}
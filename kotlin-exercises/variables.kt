const val CONST_HI = "Hi" //constant initialized at runtime, not applicable to local variable

fun main() {
    var variable: Int? //mutable variable can be assigned multiple times, Kotlin is not dynamically typed
    var inferredVariable = 22

    val valor: Int? //immutable, can be initialized only one time like 'final' in Java
    //the '?' - nullability symbol, nullability not allowed when inferring type
}

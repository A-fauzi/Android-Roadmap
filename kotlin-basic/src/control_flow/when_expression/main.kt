package control_flow.when_expression

fun main() {
    val cardInt = 11
    when(cardInt) {
        11 -> println("Jack")
        12 -> println("Queen")
        13 -> println("King")
        else -> println("Other")
    }
}
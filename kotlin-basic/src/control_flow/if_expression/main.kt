package control_flow.if_expression

fun main() {
    val a = 5
    val b = 3
    var aIsBigger = false
    aIsBigger = a > b
    println(aIsBigger)

    if (a > b) {
        println("aIsBigger")
    } else {
        println("aIsNotBigger")
    }
}
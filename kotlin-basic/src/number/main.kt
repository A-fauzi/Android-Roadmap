package number

fun main() {
    val num1Default = 42 // int (number default)
    println("$num1Default \n")
    val num2Default = 3.14 // double (number default)
    println("$num2Default \n")

    val num3 = 42L // long (initials converter)
    println("$num3 \n")

    val num4 = 3.14f // float (initials converter)
    println("$num4 \n")

    val num1Convert = num1Default.toLong()
    println("$num1Convert \n")

    val num2Convert = num2Default.toFloat()
    println("$num2Convert \n")

    val distToMoon = 1_000_000 // Using underscore in number
    println(distToMoon)
}
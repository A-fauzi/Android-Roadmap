package string

fun main() {
    val language = "Kotlin"
    val creator = "Jetbrains"
    val description = language + " is created by " + creator // string concat biasa
    println(description)

    val desc = "$language is created by $creator" // string concat template
    println(desc)

}
package function

fun main() {
    greeting("SpiderMan \n")
    person("Batman", "23")
    person("Superman", "19")
}

fun greeting(name: String) {
    println("Hello $name")
}

fun person(name: String, age: String) {
    println("name: $name \n age: $age")
}
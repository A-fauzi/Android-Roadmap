package `object`


// Object dikenal dengan sebutan singleton

/**
 * Get data animals
 */
object Animal {
    fun dataElephant(){
        println("""
            name: Elephant
            age: 10 month
        """.trimIndent())
    }

    fun dataCat() {
        println("""
            name: Cat
            age: 5 month
        """.trimIndent())
    }

    fun dataDog() {
        println("""
            name: Dog
            age: 3 month
        """.trimIndent())
    }
}
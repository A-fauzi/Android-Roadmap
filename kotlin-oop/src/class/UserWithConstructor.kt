package `class`

class UserWithConstructor(nameConstruct: String, ageConstruct: Int) {
    private val name = nameConstruct
    private val age = ageConstruct

    fun getDataUser(){
        println("""
            name: $name
            age: $age
            
        """.trimIndent())
    }
}
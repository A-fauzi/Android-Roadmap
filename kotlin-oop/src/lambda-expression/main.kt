package `lambda-expression`

fun main() {


    /**
     * deklarasi lambda parameter
     */
    val addLambda: (Int, Int) -> Int = { a: Int, b: Int -> Int
        a + b
    }
    println(addLambda(25, 25))

    /**
     * deklarasi lambda 1 parameter
     */
    val addLambdaOneParam: (Int) -> Int = {
        it * 2
    }
    println(addLambdaOneParam(10))


    // Karena lambda merupakan argument terakhir maka bisa dikeluarkan
    manchesterUnitedDuo("Dwight Yorke", "Andy Cole") { a, b ->
        "Manchester united dynamic duo $a and $b"
    }

    /**
     * Lambda tanpa parameter dan return value
     */
    val noParameterLambda: () -> Unit = {
        println("Glory Glory Man United!")
    }
    noParameterLambda()

    /**
     * Lambda scope
     */
    var count = 0
    val increment = {
        count+= 1
        println(count)
    }
    increment()


}

/**
 * Lambda sebagai argument
 */
fun manchesterUnitedDuo(striker1: String, striker2: String, operation: (String, String) -> String): String {
    val result = operation(striker1, striker2)
    println(result)
    return result
}



/*
    Todo : Kesimpulan
            Lambda adalah fungsi tanpa nama.
            Lambda dapat dipakai sebagai argument fungsi.
            Contoh umum penggunaan lambda pada Android.
            Lambda punyai syntax yang lebih ringkas.
            Lambda dapat mengakses variabel sesuai pada scope lambda tersebut didefinisikan.
            Penggunaan lambda pada collections.
 */

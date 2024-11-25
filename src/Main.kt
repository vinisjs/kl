package systemEletronic

fun main() {

    var init: Int? = 0

    do {
        println("Welcome to hub of systems")
        println("*** --- ***")
        println("Select one System")
        println("01 - Sistema Eleitoral")
        println("02 - Sistema Carros")
        println("00 - Exit System")

        val input = readln()
        init = input.toIntOrNull()

        when(init) {
            1 -> eletronic()
            2 -> println("sistema inacabado")
        }

    } while (init != 0)

}

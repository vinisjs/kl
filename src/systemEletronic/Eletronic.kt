package systemEletronic


fun eletronic() {

    fun menu () {
        var init: Int? = 0

        do {
            println("*** MENU ***")
            println("1 - Criar Partido")
            println("2 - Criar Candidato")
            println("3 - Iniciar Votação")

            val input = readln()
            init = input.toIntOrNull()

        } while ( init != 0 )
    }

    val partyAll = mutableListOf<Partido>()

    val party = Partido()

    partyAll.add(party.createParty())



    println("name from candidate")
    val candidateName: String = readln()

    println("")
}
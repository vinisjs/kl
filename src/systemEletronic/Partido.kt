package systemEletronic

class Partido {

    var name: String = ""
    var slug: String = ""

    public fun createParty (): Int {
        println("name from party:")
        val partyName: String = readln()
        this.name = partyName
        println("name from party slug:")
        val partySlug: String = readln()
        this.slug = partySlug

        return 0
    }
}
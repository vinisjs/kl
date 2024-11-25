package systemEletronic

class Candidates ( private var points: Int? = null, private var name: String? = null, private var partido: List<Partido>? = null) {

    public fun createCandidate( name: String,  party: List<Partido>? = null) {
       this.name = name
       this.partido = party
    }
}
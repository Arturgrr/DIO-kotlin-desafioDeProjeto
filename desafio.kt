enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val idade: Int) {
    public fun Info() {
        println("$nome, $idade anos de idade")
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val artur = Usuario("Artur", 17)
    artur.Info()
    
    val AulaSintaxe = ConteudoEducacional("Sintaxe")
    val AulaFundamentos = ConteudoEducacional("Fundamentos")
    val KotlinMaster = Formacao("KorlinMaster", mutableListOf(AulaSintaxe, AulaFundamentos), Nivel.INTERMEDIARIO)
    println(KotlinMaster)
    
}

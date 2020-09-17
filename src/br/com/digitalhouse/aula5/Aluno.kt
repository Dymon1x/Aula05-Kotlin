package br.com.digitalhouse.aula5

class Aluno(val registroAcademico: RegistroAcademico, val nome: String, val sobrenome: String) {

    fun assistirAula(aula: Aula) {
        println("$nome $sobrenome está assistindo a aula da materia de ${aula.materia.nome}")
    }

    fun fazerDeverDeCasa(materia: Materia) {
        println("$nome $sobrenome está fazendo os exercicios ${materia.nome}")
    }
}
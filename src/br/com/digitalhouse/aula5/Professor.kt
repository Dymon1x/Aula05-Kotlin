package br.com.digitalhouse.aula5

class Professor(val RD: RegistroDocente, val nome: String) {

    fun darAula(aula: Aula) {
        println("$nome está dando aula de ${aula.materia.nome} iniciando ás ${aula.horarioInicio} até ${aula.horarioFim}")
    }

    fun fazerChamada(curso: Curso, alunos: List<Aluno>) {
        if (curso.professor != this) {
            throw Exception("Professor $nome não é o responsável pelo curso ${curso.nome}")
        }

        println("Professor $nome está fazendo a chamada no curso de ${curso.nome}:")

        curso.alunos.forEach {
            if (alunos.contains(it)) {
                println("${it.nome} está presente")
            }
            else {
                println("${it.nome} está ausente")
            }
        }
    }
}
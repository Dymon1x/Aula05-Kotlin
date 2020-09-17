package br.com.digitalhouse.aula5
import java.time.LocalTime

fun main() {
    val aluno1 = Aluno(RegistroAcademico(101101), "João", "Santos")
    val aluno2 = Aluno(RegistroAcademico(102102), "Maria", "Silva")
    val aluno3 = Aluno(RegistroAcademico(103103), "Leonardo", "Souza")
    val aluno4 = Aluno(RegistroAcademico(104104), "José", "Almeida")

    val alunos = listOf(aluno1, aluno2, aluno3, aluno4)

    val professor = Professor(RegistroDocente(123456789), "Geraldo")

    val materia = Materia("IA")
    val aula = Aula(materia, LocalTime.of(10, 0), LocalTime.of(11, 15))

    val curso = Curso("Ciência da Computação", listOf(aula), professor, alunos)

    aluno1.assistirAula(aula)
    aluno2.fazerDeverDeCasa(materia)
    aluno3.assistirAula(aula)
    aluno4.fazerDeverDeCasa(materia)
    println()
    professor.fazerChamada(curso, listOf(aluno2, aluno3, aluno4))
    println()
    professor.darAula(aula)

    println("================")
}
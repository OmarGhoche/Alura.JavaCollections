package br.com.alura;

import java.util.*;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

       Set<Aluno> alunos = javaColecoes.getAlunos();
       
       Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);

       //tente adicionar mais um aluno no Set de alunos (sempre sem acentos)
//       
//       alunos.add(new Aluno("João", 75837));
//       ßß
//       for (Aluno aluno : alunos) {
//		System.out.println(aluno);
//       }
       
       System.out.println(alunosSincronizados);
    }
}
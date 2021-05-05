package br.com.alura;

import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos
        alunos.add("Omar");
        alunos.add("Joao");
        alunos.add("Maria");
        alunos.add("Fernando");
        alunos.add("Junior");

        //2) imprima o tamanho da colecao
        System.out.println(alunos.size());

        //3) tente adicionar um aluno que existe
        boolean adicionou = alunos.add("Fernando");
        System.out.println("Fernando foi adicionado ao Set? " + adicionou);
        
        adicionou = alunos.add("Marta");
        System.out.println("Marta foi adicionado ao Set? " + adicionou);

        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos.size());
    }
}
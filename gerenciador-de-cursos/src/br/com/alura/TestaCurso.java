package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso python1 = new Curso("introdução ao Python 3", "Omar Ghoche");
		List<Aula> aulas = python1.getAulas();
		
		System.out.println(python1);

		python1.adiciona(new Aula("Diferenças ente Python 2 e Python 3", 30));
		python1.adiciona(new Aula("Porque Python é a melhor linguagem de programação do Universo!?!", 60));
		python1.adiciona(new Aula("Fim do curso", 4));
		
		System.out.println(aulas);

	}

}

package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso python1 = new Curso("introdução ao Python 3", "Omar Ghoche");
		Collection<Aula> aulasImutaveis = python1.getAulas();

		python1.adiciona(new Aula("Z", 30));
		python1.adiciona(new Aula("A", 60));
		python1.adiciona(new Aula("L", 4));

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		Collections.singletonList(aulas);
		
		System.out.println(aulas);
		
	}

}

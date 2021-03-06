package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteMatriculaDeAlunos {

	public static void main(String[] args) {
		
		Curso padeiro = new Curso("pães franceses", "Omar Ghoche");
		
		padeiro.adiciona(new Aula("Massas", 40));
		padeiro.adiciona(new Aula("Fermentos", 50));
		padeiro.adiciona(new Aula("Geleias", 40));
		
		padeiro.matricula(new Aluno("Jose", 34556));
		padeiro.matricula(new Aluno("Marta", 956835));
		padeiro.matricula(new Aluno("Lakshmi", 0));
		
//		System.out.println(padeiro.getAlunos());
//		System.out.println(padeiro.getAulas());
//		System.out.println(padeiro.getTempoTotal());
		
//		padeiro.getAlunos().forEach(aluno -> {
//		    System.out.println(aluno);
//		});
		
		
		Set<Aluno> set = padeiro.getAlunos();
		
		Iterator<Aluno> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getNome());
		}

	}

}

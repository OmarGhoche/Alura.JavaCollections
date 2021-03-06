package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	
	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
    	if (nome == null) {
    		throw new NullPointerException("Nome não pode ser nulo");
    	}
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    @Override
    public String toString() {
    	return "Curso de " + this.nome + " ministrado por " + this.instrutor;
    }
    
    public void adiciona(Aula aula) {
    	this.aulas.add(aula);
	}
    
    public int getTempoTotal() {
		return this.getAulas().stream().mapToInt(Aula::getTempo).sum();
	}
    
    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    
    public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
    
    private boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(alunos);

	}
    
    public Aluno buscaMatriculado(int numero) {
        return this.matriculaParaAluno.get(numero);
    }
    
    @Override
    public boolean equals(Object obj) {
    	Aluno outro = (Aluno) obj;
    	return this.nome.equals(outro.getNome());
    }
    
    @Override
    public int hashCode() {
    	return this.nome.hashCode();
    }
}

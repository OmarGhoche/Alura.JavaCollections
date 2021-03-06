package br.com.ximi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        //System.out.println(pessoas.keySet());
        
        Set<Integer> keys = pessoas.keySet();
        
        for (Integer integer : keys) {
			System.out.println(pessoas.get(integer));
		}
        
        System.out.println("\nanother way:\n");

        pessoas.keySet().forEach(idade -> {
        	System.out.println(pessoas.get(idade));
        });
        
    }
}

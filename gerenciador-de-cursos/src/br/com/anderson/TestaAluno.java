package br.com.anderson;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);

//		for (String aluno : alunos) {
//			System.out.println(aluno);
//			
//		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		

	}

}

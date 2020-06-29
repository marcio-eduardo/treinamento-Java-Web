package com.java.classes;



public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		Aluno aluno2 = new Aluno("Maria");
		
		Aluno aluno3 = new Aluno("João", 35);
		
		System.out.println(aluno3.nome);
	}

}

package com.java.curso;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		//Chama o JOption e armazena os dados nas respectivas variáveis
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas= JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		
		//Converte os dados em double
		double qtdCarros = Double.parseDouble(carros);
		double qtdPessoas = Double.parseDouble(pessoas);
		
		int divisao = (int) (qtdCarros / qtdPessoas);
		
		double resto = qtdCarros % qtdPessoas;
		
		//abre um JOption message
		JOptionPane.showMessageDialog(null,"A divisão para cada pessoa foi de " + divisao + " carros e sobrou " + resto + " carros.");
		System.out.println("A divisão para cada pessoa foi de " + divisao + " carros e sobrou " + resto + " carros. ");
		

	}

}

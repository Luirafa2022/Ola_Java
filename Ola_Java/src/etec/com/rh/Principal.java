package etec.com.rh;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car = new Carro();
		
		JOptionPane.showInternalMessageDialog(null, car.Compra());
		
		car.Compra();
		
		/*
		System.out.println("Ol� Java");
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao Java");
		
		String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
		
		//Meu primeiro ol� em Java
		
		String carro; //Tipo character
		int ano; //Tipo inteiro
		float peso; //Tipo decimal
		double peso2; //Decimal
		long producao; //Tipo longo
		boolean compra; //0 e 1 / Sim e N�o
		
		//Convers�o (Promo��o)
		carro = JOptionPane.showInputDialog("Qual carro voc� deseja?");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Qual ano voc� gostaria?"));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o peso do carro?"));
		producao = Long.parseLong(JOptionPane.showInputDialog("Quantidade fabricada?"));
		compra = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja comprar, escolha 0- N�o e 1- Sim"));
		
		//Imprimir o resultado
		JOptionPane.showMessageDialog(null, 
				"O carro escolhido �: " + carro +
				"\nO ano carro �: " + ano +
				"\nO peso do carro �: " + peso +
				"\nQuantidade frabicada: " + producao +
				"\nA compra foi efetuada - status: " + compra
				);

		*/
		
	}

}

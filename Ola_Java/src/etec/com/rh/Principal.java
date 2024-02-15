package etec.com.rh;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car = new Carro();
		
		JOptionPane.showInternalMessageDialog(null, car.Compra());
		
		car.Compra();
		
		/*
		System.out.println("Olá Java");
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao Java");
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
		
		//Meu primeiro olá em Java
		
		String carro; //Tipo character
		int ano; //Tipo inteiro
		float peso; //Tipo decimal
		double peso2; //Decimal
		long producao; //Tipo longo
		boolean compra; //0 e 1 / Sim e Não
		
		//Conversão (Promoção)
		carro = JOptionPane.showInputDialog("Qual carro você deseja?");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Qual ano você gostaria?"));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o peso do carro?"));
		producao = Long.parseLong(JOptionPane.showInputDialog("Quantidade fabricada?"));
		compra = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja comprar, escolha 0- Não e 1- Sim"));
		
		//Imprimir o resultado
		JOptionPane.showMessageDialog(null, 
				"O carro escolhido é: " + carro +
				"\nO ano carro é: " + ano +
				"\nO peso do carro é: " + peso +
				"\nQuantidade frabicada: " + producao +
				"\nA compra foi efetuada - status: " + compra
				);

		*/
		
	}

}

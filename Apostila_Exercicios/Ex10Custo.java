package exerciciosApostila2007;

import java.util.Scanner;

public class Ex10Custo {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.print("Digite o valor do seu carro para calcularmos"
		+ "\n" + "o Imposto e o percentual do Distribuidor: ");
		int carro = scn.nextInt();
		scn.close();
		
		 int distribuidor = carro *28/100;
		 int imposto = carro *45/100;
		 
		 
		 int total = carro + distribuidor + imposto;
		 
		 System.out.println("O custo total do seu carro é de:" + total + " Reais");
	}
	
	
}

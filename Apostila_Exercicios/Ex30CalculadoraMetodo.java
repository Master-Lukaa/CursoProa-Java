package explica��o;

import java.util.Scanner;

public class Ex30CalculadoraMetodo {

	
	static void soma() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ent�o vamos fazer uma soma"+"\n"+"Digite um n�mero: ");
		int n1 = scn.nextInt();
		System.out.print("Digite outro n�mero para fazer a soma: ");
		int n2 = scn.nextInt();
		
		int soma = n1 + n2;
		System.out.println("A soma dos n�meros �: " + soma);
		scn.close();
		
	}
		static void subtracao() {
			Scanner scn = new Scanner(System.in);
			System.out.print("Ent�o vamos fazer uma subtra��o"+"\n"+"Digite um n�mero: ");
			int n3 = scn.nextInt();
			System.out.print("Digite outro n�mero para fazer a subtra��o: ");
			int n4 = scn.nextInt();
			
			int subtracao = n3 - n4;
			System.out.println("A subtra��o dos n�meros �: " + subtracao);
			scn.close();
			
}
		static void divisao() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ent�o vamos fazer uma divis�o"+"\n"+"Digite um n�mero: ");
		double n5 = scn.nextDouble();
		System.out.print("Digite outro n�mero para fazer a divis�o: ");
		double n6 = scn.nextDouble();
		
		double divisao = n5 / n6;
		System.out.println("A divis�o dos n�meros �: " + divisao);
		scn.close();
		
	}
		static void multiplicacao() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ent�o vamos fazer uma multiplica��o"+"\n"+"Digite um n�mero: ");
		int n7 = scn.nextInt();
		System.out.print("Digite outro n�mero para fazer a multiplica��o: ");
		int n8 = scn.nextInt();
		
		int multiplicacao = n7 * n8;
		System.out.println("A multiplica��o dos n�meros �: " + multiplicacao);
		scn.close();
		
		
}
		
	
 public static void main(String[]args) {
			
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Ol� Bem vindo a calculadora Luluzinho chan "
					+ "\n"+"o que voc� deseja ?\n");
			
			System.out.println("1-soma\n"+"2-Subtra��o\n"+"3-Divis�o\n"+"4-Multiplica��o\n");
			int escolha = scn.nextInt();
			scn.close();
			
			switch (escolha) {
			case 1:
				soma();
			break;
				
			case 2:
				subtracao();
			break;
			
			case 3:
				divisao();
			break;
			
			case 4:
				multiplicacao();
				break;
				
			default: 
				System.out.println("Digite um n�mero v�lido :(");
			break;
			}
			
			
			
		}
		
	

}
	
	
	


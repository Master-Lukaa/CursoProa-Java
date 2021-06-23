package explicação;

import java.util.Scanner;

public class Ex30CalculadoraMetodo {

	
	static void soma() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Então vamos fazer uma soma"+"\n"+"Digite um número: ");
		int n1 = scn.nextInt();
		System.out.print("Digite outro número para fazer a soma: ");
		int n2 = scn.nextInt();
		
		int soma = n1 + n2;
		System.out.println("A soma dos números é: " + soma);
		scn.close();
		
	}
		static void subtracao() {
			Scanner scn = new Scanner(System.in);
			System.out.print("Então vamos fazer uma subtração"+"\n"+"Digite um número: ");
			int n3 = scn.nextInt();
			System.out.print("Digite outro número para fazer a subtração: ");
			int n4 = scn.nextInt();
			
			int subtracao = n3 - n4;
			System.out.println("A subtração dos números é: " + subtracao);
			scn.close();
			
}
		static void divisao() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Então vamos fazer uma divisão"+"\n"+"Digite um número: ");
		double n5 = scn.nextDouble();
		System.out.print("Digite outro número para fazer a divisão: ");
		double n6 = scn.nextDouble();
		
		double divisao = n5 / n6;
		System.out.println("A divisão dos números é: " + divisao);
		scn.close();
		
	}
		static void multiplicacao() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Então vamos fazer uma multiplicação"+"\n"+"Digite um número: ");
		int n7 = scn.nextInt();
		System.out.print("Digite outro número para fazer a multiplicação: ");
		int n8 = scn.nextInt();
		
		int multiplicacao = n7 * n8;
		System.out.println("A multiplicação dos números é: " + multiplicacao);
		scn.close();
		
		
}
		
	
 public static void main(String[]args) {
			
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Olá Bem vindo a calculadora Luluzinho chan "
					+ "\n"+"o que você deseja ?\n");
			
			System.out.println("1-soma\n"+"2-Subtração\n"+"3-Divisão\n"+"4-Multiplicação\n");
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
				System.out.println("Digite um número válido :(");
			break;
			}
			
			
			
		}
		
	

}
	
	
	


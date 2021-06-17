package exerciciosApostila2007;
import java.util.Scanner;

public class Ex8Eleicao {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	
	
		System.out.print("Digite o número total de Eleitores: " );
		double eleitor = scn.nextDouble();
		
		System.out.print("Digite o número de votos Brancos: " );
		double votoB = scn.nextDouble();
		
		System.out.print("Digite o número de votos Nulos: " );
		double votoN = scn.nextDouble();
		
		System.out.print("Digite o número de votos Válidos: " );
		double votoV = scn.nextDouble();
		
		double VB = votoB/eleitor * 100;
		double VN = votoN/eleitor * 100;
		double VV = votoV/eleitor * 100;
		
		System.out.println("O Percentual de votos Brancos é de " + VB +", De Nulos é "+ VN+ " E de Válidos é " + VV );
		
		
		scn.close();
	}
	
	
	
}

package exerciciosApostila2007;
import java.util.Scanner;

public class Ex8Eleicao {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	
	
		System.out.print("Digite o n�mero total de Eleitores: " );
		double eleitor = scn.nextDouble();
		
		System.out.print("Digite o n�mero de votos Brancos: " );
		double votoB = scn.nextDouble();
		
		System.out.print("Digite o n�mero de votos Nulos: " );
		double votoN = scn.nextDouble();
		
		System.out.print("Digite o n�mero de votos V�lidos: " );
		double votoV = scn.nextDouble();
		
		double VB = votoB/eleitor * 100;
		double VN = votoN/eleitor * 100;
		double VV = votoV/eleitor * 100;
		
		System.out.println("O Percentual de votos Brancos � de " + VB +", De Nulos � "+ VN+ " E de V�lidos � " + VV );
		
		
		scn.close();
	}
	
	
	
}

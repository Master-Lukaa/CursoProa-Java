package exercicios;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = scn.nextInt();
		
		int sucessor = numero + 1;
		
		System.out.println("O sucessor de: " + numero + " é " + sucessor + ".");
		
		scn.close();
	}

}
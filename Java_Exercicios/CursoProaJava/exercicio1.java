package exercicios;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = scn.nextInt();
		
		int antecessor = numero - 1;
		
		System.out.println("O antecessor De: " + numero + " é " + antecessor + ".");
		
		scn.close();
	}

}

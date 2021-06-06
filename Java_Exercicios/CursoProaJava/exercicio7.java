package exercicios;
import java.util.Scanner;

public class exercicio7{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a medida do lado do quadrado (cm): ");
		int lado = scn.nextInt();
		
		double area = lado * lado;
		
		System.out.println("A área deste quadrado é De: " + area + " cm");
		
		scn.close();
	}

}


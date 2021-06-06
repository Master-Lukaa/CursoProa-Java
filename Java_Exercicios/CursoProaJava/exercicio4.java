package exercicios;
import java.util.Scanner;

public class exercicio4{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a medida do raio do círculo (cm): ");
		double raio = scn.nextInt();
		
		double area =  3.14159 * (raio*raio);
		
		System.out.println("A área do círculo é De: " + area + " cm");

		scn.close();
	}

}

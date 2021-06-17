package exerciciosApostila2007;
import java.util.Scanner;

public class Ex20Circulo{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a medida do raio do circulo (cm): ");
		double raio = scn.nextInt();
		
		double area =  3.14159 * (raio*raio);
		
		System.out.println("A area do circulo é De: " + area + " cm");

		scn.close();
	}

}

package exerciciosApostila2007;
import java.util.Scanner;

public class Ex19Triangulo{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Informe a medida da altura do triangulo (cm): ");
		double alt = scn.nextInt();
		
		System.out.print("Informe a medida da base do triangulo (cm): ");
		double base = scn.nextInt();
		
		double area = (base * alt) / 2;
		
		System.out.println("A area deste triangulo é De " + area + " cm");
		scn.close();
	}

}


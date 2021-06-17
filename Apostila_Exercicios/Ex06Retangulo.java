package exerciciosApostila2007;
import java.util.Scanner;

public class Ex06Retangulo{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite a medida da altura do retangulo (cm):");
		int alt = scn.nextInt();
		System.out.print("Digite a medida da base do trianngulo (cm):");
		int base = scn.nextInt();
		
		int area = base * alt;
		System.out.print("A area deste retangulo é De: " + area + " cm");
		
		scn.close();
	}

}

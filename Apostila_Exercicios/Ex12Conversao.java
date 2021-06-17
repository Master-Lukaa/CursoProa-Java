package exerciciosApostila2007;
import java.util.Scanner;

public class Ex12Conversao {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Vamos converter graus farenheint em Celsius Digite um valor: ");
		int farenheint = scn.nextInt();
		
		int celsius = 5 * (farenheint - 32) / 9;
		
		System.out.println("a conversão é de: " + celsius + " Graus C°");
		
		scn.close();
		
		
	}

}

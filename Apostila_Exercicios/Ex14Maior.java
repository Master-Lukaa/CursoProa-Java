package exerciciosApostila2007;
import java.util.Scanner;
public class Ex14Maior {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = scn.nextInt();
		
		if (n>10) {
			System.out.println( n + " � MAIOR QUE 10 ");
		
		}
		else if (n<10) {
			System.out.println("� MENOR QUE 10");
			scn.close();
			
		}
		
		
		}
		
		
	}




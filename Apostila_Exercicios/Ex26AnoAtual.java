package exerciciosApostila2007;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex26AnoAtual {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int anoAtual = LocalDate. now (). getYear();
		System.out.println("As eleições de " + anoAtual + " começaram em breve");
	   
		System.out.print("Por favor Digite o ano em que você nasceu: ");
		int ano = scn.nextInt();
	
		
		if (ano > 2005 ) {
			System.out.println("Você não poderá votar esse ano :(");
			
		} else if (ano < 2005 ){
			System.out.println("Você poderá votar esse ano :)");
			scn.close();
			

		} 
		
	}

	
}

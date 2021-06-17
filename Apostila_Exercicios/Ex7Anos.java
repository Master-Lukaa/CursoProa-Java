package exerciciosApostila2007;

import java.util.Scanner;

public class Ex7Anos {
	public static void main(String[] args) {
		
	Scanner scn = new Scanner (System.in);
	System.out.print("Qual é a sua idade?: ");
	int idade =scn.nextInt();
	
	System.out.print("Quantos meses passou desde o seu aniversário?: ");
	int mes =scn.nextInt();
	
	System.out.print("Quanto dias passou desde o seu ultimo mêsversário?: ");
	
	int dias = scn.nextInt();
	
	int anoDia = idade * 365;
	int mesesDia = mes * 30;
	
	int resultado = anoDia + mesesDia + dias;
	System.out.println("Sua idade em dias é de:  " + resultado);
	
	scn.close();
	




	}
	
}

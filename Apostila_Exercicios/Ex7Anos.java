package exerciciosApostila2007;

import java.util.Scanner;

public class Ex7Anos {
	public static void main(String[] args) {
		
	Scanner scn = new Scanner (System.in);
	System.out.print("Qual � a sua idade?: ");
	int idade =scn.nextInt();
	
	System.out.print("Quantos meses passou desde o seu anivers�rio?: ");
	int mes =scn.nextInt();
	
	System.out.print("Quanto dias passou desde o seu ultimo m�svers�rio?: ");
	
	int dias = scn.nextInt();
	
	int anoDia = idade * 365;
	int mesesDia = mes * 30;
	
	int resultado = anoDia + mesesDia + dias;
	System.out.println("Sua idade em dias � de:  " + resultado);
	
	scn.close();
	




	}
	
}

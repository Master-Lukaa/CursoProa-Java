package exerciciosApostila2007;

import java.util.Scanner;

public class Ex29Xadrez {
	
	
public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Por favor Informe o horário de início e término\n" + "da partida de xadrez" + " (exceto minutos e segundos)\n");
				
			System.out.print("Horário de início: ");
			int hora1 = scn.nextInt();
			
			System.out.print("Horário de término: ");
			int hora2 = scn.nextInt();
			
			if(hora2 > hora1){
				
				int duracao = hora2 - hora1;
				System.out.println("Duração da partida: " + duracao + " horas");
			}
			
			else if(hora1 > hora2){
				int duracao = 24 - hora1 + hora2;
				System.out.println("Duração da partida: " + duracao + " horas");
			}
			
			else {
				System.out.println("A Duração de 24 horas foi atingida!");
			}
			
			scn.close();
		}

	}

	

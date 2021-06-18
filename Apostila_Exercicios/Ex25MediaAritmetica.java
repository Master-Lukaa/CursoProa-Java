package exerciciosApostila2007;
import java.util.Scanner;
public class Ex25MediaAritmetica {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Olá Aluno irei Calcular a sua Média" + "\n"
		+ "Por favor Digite a sua primeira nota:");
		
		int nota = scn.nextInt();

		System.out.print("Agora digite a sua segunda nota:");
		int nota2 = scn.nextInt();
		
		int mediaA = (nota + nota2)/2;  
		
		
		if (mediaA<6) {
			System.out.println("A sua média é " + mediaA +" Você foi REPROVADO!!");
			
		} else if(mediaA>6){
			System.out.println("SUA Média é "+ mediaA+ " Parabéns você foi APROVADO!!");
			scn.close();
			

		}
		
		
		
		
		
		
	}

}

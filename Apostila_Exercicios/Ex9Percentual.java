package exerciciosApostila2007;
import java.util.Scanner;

public class Ex9Percentual {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do seu sal�rio: ");
		float salario = scanner.nextFloat();
		System.out.print("Digite o valor do seu reajuste:");
		float reajuste = scanner.nextFloat();	
		float novosalario = (salario+(salario*(reajuste/100)));
		
		System.out.print(" Seu novo sal�rio � de:" + novosalario);
		
		scanner.close();
	}
	

}



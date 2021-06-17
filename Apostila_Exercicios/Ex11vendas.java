package exerciciosApostila2007;

import java.util.Scanner;
public class Ex11vendas {
  
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Irei calcular o salário desse mês "
				+ "\n"+"por favor Digite o total de carros vendidos: ");
        int vendasCarro = scn.nextInt();
        
        System.out.print("Agora digite o valor de suas vendas: ");
        int totalVendas  = scn.nextInt();
        
        System.out.print("Agora digite o seu salário fixo: ");
        int salarioFixo  = scn.nextInt();
        
        System.out.print("Agora digite a sua comissão por carro vendido: ");
        int valorCarroVendido  = scn.nextInt();
        
        int com1 = vendasCarro * valorCarroVendido;
        int com2 = totalVendas * 5/100;
        
        int salarioFinal = salarioFixo + com1 + com2;
        
        System.out.println("O salário desse mês é de: " + salarioFinal + " Reais");
        
        scn.close();
        
        
	
}
}

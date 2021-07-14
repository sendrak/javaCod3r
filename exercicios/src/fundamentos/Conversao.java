package fundamentos;

import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o Primeiro valor:");
		String num1 = scan.next().replace(",", ".") ;
		
		System.out.print("\nInforme o Segundo valor:");
		String num2 = scan.next().replace(",", ".") ;
		
		System.out.print("\nInforme o Terceiro valor:");
		String num3 = scan.next().replace(",", ".") ;
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		double numero3 = Double.parseDouble(num3);
		
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("\nMedia: "+media);
		
		scan.close();
		
		
	}

}

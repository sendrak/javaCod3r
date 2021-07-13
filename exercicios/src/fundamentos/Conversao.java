package fundamentos;

import java.util.Scanner;

public class Conversao {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor:");
		double numero1 = Double.parseDouble(scan.nextLine()) ;
		
		System.out.print("\nInforme o primeiro valor:");
		double numero2 = Double.parseDouble(scan.nextLine()) ;
		
		System.out.print("\nInforme o primeiro valor:");
		double numero3 = Double.parseDouble(scan.nextLine()) ;
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("\nMedia: "+media);
		
		
		
		
	}

}

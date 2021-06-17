package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//Double = Número Real
		//Int = Número Inteiro
		double raio = 3.4;
		//Final faz com que o valor não possa ser alterado durante a execução do programa
		final double pi = 3.14159;
		
		double area = pi * (raio*raio);
		System.out.println("Area 1 = " + area);
		
		raio = 10;
		area = pi * (raio*raio);
		System.out.println("Area 2 = " + area);
		
	}
}

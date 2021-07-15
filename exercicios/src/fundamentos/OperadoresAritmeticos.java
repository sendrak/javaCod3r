package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		double a = 6;
		double b = 3;
		double c = 2;
		double d = 1;
		double e = 5;
		double f = 10;
		double g = 7;
		
		double operacao1 = a*(b+c);
		double operacao2 =  (Math.pow(operacao1, c))/(b*c);
		
		double operacao3 = ((d-e)*(c-g))/c;
		double operacao4 = Math.pow(operacao3, c);
		
		double operacao5 = operacao2 - operacao4;
		double operacao6 = Math.pow(operacao5, b);
		
		int resultado = (int) operacao6 / (int) Math.pow(f, b);
		
		System.out.println("Resultado: "+ resultado);
	}

}

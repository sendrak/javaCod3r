package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(F° - 32) * 5/9 = C°
		
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		
		double farenheit = 86;
		double celcius = (farenheit - ajuste) * fator;
		
		System.out.println("Farenheit: " + farenheit + "F°");
		System.out.println("Celcius: " + celcius + "C°");
		
	}
}

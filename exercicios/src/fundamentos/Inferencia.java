package fundamentos;

public class Inferencia {

		public static void main(String[] args) {
			double a = 4.5;
			System.out.println(a);
			
			//Infere que a vari�vel � double, pois recebe um valor double
			var b = 4.5;
			System.out.println(b);
			
			var c = "Texto";
			System.out.println(c);
			
			c = "Outro texto";
			System.out.println(c);
			
			//N�o � poss�vel inferir um tipo diferente na vari�vel que j� foi inferida
			
			double d; //Variavel foi criada
			d = 123.123; //Variavel foi inicializada
			System.out.println(d); //Variavel foi usada
			
			//N�o � poss�vel, a vari�vel deve ser inicializada no momento da declara��o
			//var e;
			//e = 120;
			
		}
}

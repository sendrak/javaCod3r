package fundamentos;

public class Inferencia {

		public static void main(String[] args) {
			double a = 4.5;
			System.out.println(a);
			
			//Infere que a variável é double, pois recebe um valor double
			var b = 4.5;
			System.out.println(b);
			
			var c = "Texto";
			System.out.println(c);
			
			c = "Outro texto";
			System.out.println(c);
			
			//Não é possível inferir um tipo diferente na variável que já foi inferida
			
			double d; //Variavel foi criada
			d = 123.123; //Variavel foi inicializada
			System.out.println(d); //Variavel foi usada
			
			//Não é possível, a variável deve ser inicializada no momento da declaração
			//var e;
			//e = 120;
			
		}
}

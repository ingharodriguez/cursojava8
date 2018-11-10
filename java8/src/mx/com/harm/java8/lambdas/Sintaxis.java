package mx.com.harm.java8.lambdas;

public class Sintaxis {
	
	public void probarSintaxis() {
		//Operacion operacion = (double d1, double d2) -> {return (d1+d2)/2;};
		Operacion operacion = (double d1, double d2) -> {
			double a=2.0d;
			return (d1+d2)/a;
		};
		
		//Operacion operacion = (n1,n2)-> (n1+n2)/2;
		//Operacion operacion = ()->2;
		System.out.println(operacion.calcularPromedio(10, 30));
		//System.out.println(operacion.calcularPromedio());
	}
	public static void main(String[] args) {
		Sintaxis sintaxis = new Sintaxis();
		sintaxis.probarSintaxis();
	}
}

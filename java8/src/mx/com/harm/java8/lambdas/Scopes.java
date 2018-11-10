package mx.com.harm.java8.lambdas;

import javax.xml.ws.handler.MessageContext.Scope;

public class Scopes {
	private static double atributo1;
	private double atributo2;
	public double probarVariableLocal() {
		double n3 = 3;
		Operacion op = new Operacion() {
			
			@Override
			public double calcularPromedio(double n1, double n2) {
				return n1+n2+n3;
			}
		};
		Operacion operacion = (x,y)->{ return x+y+n3;};
		return operacion.calcularPromedio(1, 1);
	}
	
	public double probarStributosStaticVariables() {
		Operacion op = (x,y)->{
			atributo1 = x+y;
			atributo2 = atributo1;
			return atributo2;
		};
		return op.calcularPromedio(3, 2);
	}
	
	public static void main(String[] args) {
		Scopes scopes = new Scopes();
		//System.out.println(scopes.probarVariableLocal());
		System.out.println(scopes.probarStributosStaticVariables());
	}
}

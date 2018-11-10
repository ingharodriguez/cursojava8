package mx.com.harm.java8.lambdas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp { 
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("MitoCode");
		lista.add("Code");
		/*
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			};
		});
		*/
		Collections.sort(lista, (String s1, String s2)->s1.compareTo(s2));
		System.out.println(lista);
	}
	
	public void calcular() {
		/*Operacion operacion = new Operacion() {
			
			@Override
			public double calcularPromedio(double n1, double n2) {
				// TODO Auto-generated method stub
				return (n1+n2)/2;
			}
		};*/
		Operacion operacion = (n1,n2)->{ return (n1+n2)/2; };
		System.out.println(operacion.calcularPromedio(10, 20));
	}
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		//app.ordenar(s);
		app.calcular();
	}
}

package mx.com.harm.java8.interfaces;

public class DefaultMethod implements PersonaA,PersonaB {
	@Override
	public void caminar() {
		System.out.println("Hola coders");
		
	}
	
	@Override
	public void hablar() {
		//PersonaB.super.hablar();
		System.out.println("Suscribanse coders");
	}

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar();
		
	}


}

package mx.com.harm.java8.interfaces;

public interface PersonaB {
	public void caminar();
	
	default public void hablar() {
		System.out.println("Saludos coders - Persona B");
	}
}

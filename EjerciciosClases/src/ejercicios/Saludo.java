package ejercicios;

public class Saludo {
	private String palabra;
	
	public Saludo(String palabra) {
		this.palabra = palabra;
	}
	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public void imprimir() {
		System.out.println("Hola "+palabra);
	}
}

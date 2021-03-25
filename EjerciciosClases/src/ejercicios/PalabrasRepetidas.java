package ejercicios;


public class PalabrasRepetidas {
	private String palabra;
	private int numero;
	
	public PalabrasRepetidas(String palabra, int numero) {
		this.palabra=palabra;
		this.numero=numero;
	}
	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void repeticiones() {
		for (int i = 0; i < numero; i++) {
			System.out.println(palabra);
		}
	}

}

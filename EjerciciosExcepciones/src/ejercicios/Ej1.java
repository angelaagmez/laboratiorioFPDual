package ejercicios;

public class Ej1 {
	public static void main(String[] args) {
		try {
			Double resultado = (Double) null*0.5;
		} catch(NullPointerException n){
			System.out.println("El valor es nulo");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

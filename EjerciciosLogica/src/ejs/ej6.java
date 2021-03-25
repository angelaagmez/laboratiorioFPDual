package ejs;

public class ej6 {
	public static void main(String[] args) {
		triangulos(10,14,12);
		triangulos(5,5,5);
		triangulos(10,5,10);
		triangulos(2,6,6);
	}
	
	public static void triangulos(float lado1, float lado2, float lado3) {
		if(lado1==lado2 && lado2==lado3) {
			System.out.println("Triangulo equilatero");
		} else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
			System.out.println("Triangulo isosceles");
		}else if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
			System.out.println("Triangulo escaleno");
		}
	}
}

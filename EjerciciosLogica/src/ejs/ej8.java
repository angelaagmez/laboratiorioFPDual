package ejs;

public class ej8 {
	public static void main(String[] args) {
		System.out.println(diferencia(10));
		System.out.println(diferencia(25));
	}
	
	public static int diferencia(int num) {
		if(num>21) {
			return num-21;
		} else {
			return (21-num)*2;
		}
	}
}

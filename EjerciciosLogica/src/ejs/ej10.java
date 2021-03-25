package ejs;

public class ej10 {
	public static void main(String[] args) {
		System.out.println(diferencia(80));
		System.out.println(diferencia(98));
	}
	
	public static boolean diferencia(int num) {
		if(100-num<=10 || 200-num<=10) {
			return true;
		} else {
			return false;
		}
	}

}

package ejs;

public class ej13 {
	public static void main(String[] args) {
		System.out.println(esAdolescente(10,14,18));
		System.out.println(esAdolescente(10,14,21));
		System.out.println(esAdolescente(13,14,18));
		System.out.println(esAdolescente(8,20,24));
	}
	
	public static boolean esAdolescente(int edad1, int edad2, int edad3) {
		if(edad1>=13 && edad1<=19 || edad2>=13 && edad2<=19 || edad3>=13 && edad3<=19 ) {
			return true;
		}
		return false;
	}

}

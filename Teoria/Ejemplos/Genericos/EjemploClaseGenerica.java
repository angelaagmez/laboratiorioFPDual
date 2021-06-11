package colecciones;

public class EjemploClaseGenerica<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		EjemploGenerico3<Integer> integerContenedor = new EjemploGenerico3<Integer>();
		EjemploGenerico3<String> stringContenedor = new EjemploGenerico3<String>();

		integerContenedor.add(new Integer(10));
		stringContenedor.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n\n", integerContenedor.get());
		System.out.printf("String Value :%s\n", stringContenedor.get());
	}
}

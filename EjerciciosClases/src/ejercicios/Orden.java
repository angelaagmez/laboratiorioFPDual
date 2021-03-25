package ejercicios;

public class Orden{
	private String nombre;
	private double precio;
	private int codigo;
	private double kg;
	private Cliente cliente;
	private Empleado empleado;
	private boolean comprado;
	
	public Orden(String nombre, double precio, int codigo, double kg, Cliente cliente, Empleado empleado, boolean comprado) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.kg = kg;
		this.cliente = cliente;
		this.empleado = empleado;
		this.comprado = comprado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}
	
	
	public void infoProducto() {
		System.out.println("Producto: "+nombre);
		System.out.println("Precio: "+precio);
		System.out.println("Codigo: "+codigo);
		System.out.println("Peso: "+kg);
		if(comprado==true) {
			System.out.println("Cliente: "+cliente.getNombre());
			System.out.println("Vendedor: "+empleado.getNombre());
		}
	}
	
	public void estaComprado() {
		if(comprado==true) {
			System.out.println("El producto esta comprado");
		} else {
			System.out.println("El producto sigue en venta");
		}
	}
	
	public void vender() {
		if(comprado==false) {
			comprado = true;
			System.out.println("El producto ha sido vendido con exito");
		} else {
			System.out.println("El producto ya estaba vendido, lo siento");
		}
	}
	
	public void aumentarPesoPaquete(double aumento) {
		kg += aumento;
		System.out.println("El paquete ahora pesa "+kg+" kg");
	}
}

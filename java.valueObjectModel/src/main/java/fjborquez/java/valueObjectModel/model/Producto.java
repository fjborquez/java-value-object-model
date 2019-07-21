package fjborquez.java.valueObjectModel.model;

public class Producto {
	// TODO: Agregar anotaciones de hibernate
	
	private String codigo;
	private String descripcion;
	private final Moneda precio;
	
	public Producto(String codigo, String descripcion, Moneda precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Moneda getPrecio() {
		return precio;
	}
}

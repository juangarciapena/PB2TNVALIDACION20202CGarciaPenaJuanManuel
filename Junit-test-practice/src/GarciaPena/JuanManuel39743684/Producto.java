package GarciaPena.JuanManuel39743684;

public class Producto {

	private Integer id;
	private Double precio;
	private String descripcion;
	private Double peso;
	public Producto(int i, double d, String string, double e) {
		this.id=i;
		this.precio=d;
		this.descripcion=string;
		this.peso=e;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	} 
	

}

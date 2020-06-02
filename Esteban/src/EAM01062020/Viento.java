package EAM01062020;

public class Viento extends Instrumento {
	String Tipo;
	String Nombre;
	String Color;
	
	public Viento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Viento(String sNombre, String sTipo) {
		super(sNombre, sTipo);
		// TODO Auto-generated constructor stub
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}	
}

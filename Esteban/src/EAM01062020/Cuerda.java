package EAM01062020;

public class Cuerda extends Instrumento {
	int Cant_Cuerdas;
	String Nombre;
	String Color;
	
	public Cuerda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuerda(String sNombre, String sTipo) {
		super(sNombre, sTipo);
		// TODO Auto-generated constructor stub
	}
	public int getCant_Cuerdas() {
		return Cant_Cuerdas;
	}
	public void setCant_Cuerdas(int cant_Cuerdas) {
		Cant_Cuerdas = cant_Cuerdas;
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

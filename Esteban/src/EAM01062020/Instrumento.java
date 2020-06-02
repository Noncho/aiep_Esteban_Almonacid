package EAM01062020;

public class Instrumento {
	String sNombre;
	String sTipo;
	
	public Instrumento() {
	
}
	public Instrumento(String sNombre, String sTipo) {
		super();
		this.sNombre = sNombre;
		this.sTipo = sTipo;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsTipo() {
		return sTipo;
	}
	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}	
}

	
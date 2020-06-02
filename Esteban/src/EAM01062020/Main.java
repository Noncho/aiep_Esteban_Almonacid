package EAM01062020;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Instrumento instrumento = new Instrumento();	
		
		System.out.println("Ingrese tipo de instrumento (Cuerda/Viento):");
		String sTipo = sc.next();
		instrumento.setsTipo(sTipo);
		
		System.out.println("Ingrese nombre del instrumento:");
		String sNombre = sc.next();
		instrumento.setsNombre(sNombre);
		
		String Nombre = instrumento.getsNombre();
		String Tipo = instrumento.getsTipo();
		
		System.out.println( Tipo + " " + Nombre);
	}
}

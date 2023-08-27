import java.util.Scanner;

public class IngresoDeNombre {
	public static void main(String[] args) {
		System.out.print("Ingrese su nombre: ");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.next();
		scan.close();
		System.out.println("Su nombre es: " + nombre);
	}

}

import java.util.Scanner;

public class CambiarCaracteres {
	private static char aLetra(String letra) {
		letra = letra.toLowerCase();
		return letra.charAt(0);}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String palabra = scan.next();
		System.out.print("Ingrese una letra para ser cambiada(minuscula): ");
		String letra1 = scan.next();
		System.out.print("Ingrese una letra a la que ser cambiada(minuscula): ");
		String letra2 = scan.next();
		scan.close();
		
		char letra1c = aLetra(letra1);
		char letra2c = aLetra(letra2);
		palabra = palabra.toLowerCase();
		
		System.out.println("La palabra cambiada es: " + palabra.replace(letra1c, letra2c));
	}
}

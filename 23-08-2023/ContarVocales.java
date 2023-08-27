import java.util.Scanner;

public class ContarVocales {
	public static int contarVocales(String p){
		int contador = 0;
		for(int i = 0 ; i<p.length() ; i++) {
			if(p.charAt(i) == 'a' || p.charAt(i) == 'e' || p.charAt(i) == 'i' || p.charAt(i) == 'o' || p.charAt(i) == 'u') contador ++;}
		return contador;}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palabra = scan.next();
		scan.close();
		
		palabra = palabra.toLowerCase();
		
		System.out.print("Su palabra tiene " + contarVocales(palabra) + " vocales");
	}
}

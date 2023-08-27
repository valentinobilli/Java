import java.util.Scanner;

public class EsAnagrama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String palabra = scan.next();
		System.out.print("Ingrese la palabra que cree que podria ser un anagrama: ");
		String anagrama = scan.next();
		scan.close();
		
		palabra = palabra.toLowerCase();
		anagrama = anagrama.toLowerCase();
		int contador = 0;
		
		if(palabra.length() == anagrama.length()) {
			for(int i = 0 ; i<palabra.length() ; i++) {
				for(int j = 0 ; j<anagrama.length() ; j++)if(palabra.charAt(i) == anagrama.charAt(j))contador ++;}
			
			if(contador == palabra.length())System.out.print("Es un anagrama");
			else System.out.print("No es un anagrama");
		}else System.out.print("No es un anagrama");
	}
}

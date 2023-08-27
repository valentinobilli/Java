import java.util.Scanner;

public class EsPalindromo {
	public static boolean esPalindromo(String palabra) {
		int size = palabra.length();
		int contador = 0;
		if(size%2 == 0) {
			size --;
			for(int i = 0 ; i<size ; i++, size--) {
				if(palabra.charAt(i) == palabra.charAt(size)) contador ++;}
			return contador == size;
		}else {
			size --;
			for(int i = 0 ; i<size-1 ; i++, size --) {
				if(palabra.charAt(i) == palabra.charAt(size)) contador ++;}
			return contador == size;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String palabra = scan.nextLine();
		scan.close();
		
		if(esPalindromo(palabra.toLowerCase())) System.out.println("La palabra es palindroma");
		else System.out.println("La palabra no es palindroma");
	}
}

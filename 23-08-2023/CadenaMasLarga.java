import java.util.ArrayList;
import java.util.Scanner;

public class CadenaMasLarga {
	
	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<5 ; i++) {
			Print("Ingrese un valor: ");
			palabras.add(scan.next());}
		scan.close();
		
		int maximo = 0;
		int valor = 0;
		for(int i = 0 ; i<palabras.size() ; i++) {
			if(i == 0) {
				maximo = i;
				valor = palabras.get(i).length();
			}else {
				if(palabras.get(i).length() > valor) {
					maximo = i;
					valor = palabras.get(i).length();
				}
			}
		}
		
		Print("La palabra mas larga es " + palabras.get(maximo));
	}
	
	public static void Print(String texto) {
		System.out.print(texto);}

}

package Ex2;
import java.util.Scanner;

public class ParImpar {
	int valor;
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero: ");
		int valor = ler.nextInt();
		
		
		
		if((valor % 2) == 0){
			System.out.println("O n�mero � par");
			
		}else {
			System.out.println("O n�mero � �mpar.");
		}
			

	}

}

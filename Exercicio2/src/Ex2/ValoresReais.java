package Ex2;
import java.util.Scanner;

public class ValoresReais {
	double valor1, valor2;
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite um valor: ");
		double valor1 = ler.nextDouble();
		
		System.out.println("Digite mais um valor: ");
		double valor2 = ler.nextDouble();
		
		if(valor1 == valor2) {
			System.out.println("Os valores são iguais.");
		}else {
			System.out.println("Os valores são diferentes.");
		}
		

	}

}

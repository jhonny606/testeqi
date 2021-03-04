package Ex2;
import java.util.Scanner;

public class Maior {
	double valor1, valor2;
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite um valor: ");
		double valor1 = ler.nextDouble();
		
		System.out.println("Digite mais um valor: ");
		double valor2 = ler.nextDouble();
		
		if(valor1 > valor2) {
			System.out.println("O número " + valor1 + " é maior.");
		}else {
			System.out.println("O númerp " + valor2 + " é maior.");
		}
		

	}

}
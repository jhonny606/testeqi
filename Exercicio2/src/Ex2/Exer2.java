package Ex2;
import java.util.Scanner;

public class Exer2 {
	int n�mero;
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero: ");
		int n�mero = ler.nextInt();
		
		
		if(n�mero >= 0) {
			System.out.println("Este n�mero � positivo.");
		}else {
			System.out.println("Este n�mero � negativo.");
		}
		

	}

}

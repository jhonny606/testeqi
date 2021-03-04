package Ex2;
import java.util.Scanner;

public class Exer2 {
	int número;
	
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		int número = ler.nextInt();
		
		
		if(número >= 0) {
			System.out.println("Este número é positivo.");
		}else {
			System.out.println("Este número é negativo.");
		}
		

	}

}

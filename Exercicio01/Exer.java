package Ex01;
import java.util.Scanner;

public class Circunferencia {
	double raio;

	static Scanner ler = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Digite o valor do raio da circunfer�ncia: ");
		double raio = ler.nextDouble();
		
		System.out.println("O di�metro � " + (raio) * 2);
		System.out.println(" e o quadrante � " + 3,14 * (raio * raio) / 4);

	}

}

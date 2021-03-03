package Ex01;
import java.util.Scanner;

public class Circunferencia {
	double raio;

	static Scanner ler = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Digite o valor do raio da circunferência: ");
		double raio = ler.nextDouble();
		
		System.out.println("O diâmetro é " + (raio) * 2);
		System.out.println(" e o quadrante é " + 3,14 * (raio * raio) / 4);

	}

}

package Ex01;
import java.util.Scanner;

public class Algoritmo1 {
	String nome;
	double nota1, nota2, nota3;
	
	static Scanner ler = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Digite o nome do aluno: ");
		String nome = ler.nextLine();
		
		System.out.println("Digite a 1� nota do aluno: ");
		double nota1 = ler.nextInt();
		
		System.out.println("Digite a 2� nota do aluno: ");
		double nota2 = ler.nextInt();
		
		System.out.println("Digite a 3� nota do aluno: ");
		double nota3 = ler.nextInt();
		
		System.out.println("A nota final de " + (nome) + (" � ") + (nota1 + nota2 + nota3));
		
	}

}

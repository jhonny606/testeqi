package blibioteca;

import java.util.Scanner;

public class Biblioteca {

	private static final int Int = 0;

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Scanner ver = new Scanner (System.in);
		Livro l1 = new Livro();
		Cliente c1 = new Cliente();
		
		System.out.println("Digite o seu nome: ");
		c1.setNome (ler.nextLine());
		
		System.out.println("Digite a sua idade: ");
		c1.setIdade (ler.nextInt());
		
		System.out.println("Digite o titulo do livro: ");
		l1.setTitulo (ver.nextLine());
		
		System.out.println("Digite o ano do livro: ");
		l1.setAno (ver.nextInt());
		
		System.out.println("Digite o preço do livro: ");
		l1.setPreco (ver.nextDouble());
		
		System.out.println(c1);
		System.out.println(l1);
		System.out.println( c1.verificarIdade(Int) + "e" + " o preço da compra fica: ");

	}

}

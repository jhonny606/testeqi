package quest2;
import java.util.Scanner;

public class Quest2 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        double valor;
        
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextInt();
           
        
        if(valor >= 1){
            System.out.println("O produto tem " + valor * 0.025 + " reais de desconto");
        }else{
            System.out.println("O produto n�o tem desconto");
        }
    }
    
}
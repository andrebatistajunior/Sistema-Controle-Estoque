import java.util.Scanner;
public class Main {


    public static void main(String[] args){
        Produto produto1 = new Produto();

        System.out.println("Informe o nome do produto: ");

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        produto1.nome = nome;

        System.out.println("Informe a quantidade do produto: ");

        int quantidade = scanner.nextInt();

        produto1.quantidade = quantidade;

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidade);

        

       


    }
    
}

import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args){


        int i = 0;

        
        ArrayList<Produto> produtos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        
        while(i < 2){

        Produto produto = new Produto();

        System.out.print("Informe o nome do produto: ");

        String nome = scanner.nextLine();

        produto.nome = nome;


        System.out.print("Informe a quantidade do produto disponível: ");

        int quantidade = scanner.nextInt();

        produto.quantidade = quantidade;

        System.out.print("Informe o preco do produto: ");

        double preco = scanner.nextDouble();

        scanner.nextLine();

        produto.preco = preco;

        produtos.add(produto);

        i++;

        }

        for( i = 0 ; i < produtos.size(); i++){
            System.out.println("Produto " + (i + 1));
            System.out.println(produtos.get(i).nome);
            System.out.println(produtos.get(i).quantidade);
            System.out.println(produtos.get(i).preco);
        }

       

    

    }
    
}

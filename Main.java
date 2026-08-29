import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args){


        int i = 0;
        
        
        
        ArrayList<Produto> produtos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int escolha;

        do{


        System.out.println("Escolha uma opção: 1- CADASTRAR PRODUTO  2- SAIR");
        
        escolha = scanner.nextInt();

        scanner.nextLine();

        switch(escolha){

        case 1: 

        Produto produto = new Produto();

        System.out.print("Informe o nome do produto: ");

        String nome = scanner.nextLine();

        produto.nome = nome;

        System.out.print("Informe a quantidade do produto disponível: ");

        int quantidade = scanner.nextInt();
    
        produto.quantidade = quantidade;

        if(produto.quantidade <= 20){
            produto.estoque_baixo = true;

        }if(produto.quantidade > 20){
            produto.estoque_baixo = false;

        }


        System.out.print("Informe o preco do produto: ");

        double preco = scanner.nextDouble();

        scanner.nextLine();

        produto.preco = preco;

        produtos.add(produto);

        break;

        case 2:

        escolha = 2;

        break;


    }

        } while(escolha != 2);
        
    
        for( i = 0 ; i < produtos.size(); i++){
            System.out.println("Produto " + (i + 1));
            System.out.println(produtos.get(i).nome);
            System.out.println(produtos.get(i).quantidade);
            System.out.println(produtos.get(i).preco);
            if(produtos.get(i).estoque_baixo == true){
                System.out.println("Estoque baixo.");
            }if(produtos.get(i).estoque_baixo == false){
                System.out.println("Estoque Normal");
            }
        }

       
    

    }

    
}

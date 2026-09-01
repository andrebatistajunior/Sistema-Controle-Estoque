import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {
    
int escolha;

Scanner scanner = new Scanner(System.in);

ArrayList<Produto> produtos = new ArrayList<>();

public void cadastrarProduto(){

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


}

    
}

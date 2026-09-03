import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {
    
int escolha;


Scanner scanner = new Scanner(System.in);

ArrayList<Produto> produtos = new ArrayList<>();

public void cadastrarProduto(){

            do{


        System.out.println("Escolha uma opção: \n1- CADASTRAR PRODUTO  \n2- PESQUISAR UM PRODUTO \n3- DESEJA VER TODOS OS PRODUTOS CADASTRADOS ? \n4- SAIR");
        
        escolha = scanner.nextInt();

        scanner.nextLine();

        switch(escolha){

        case 1: {

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
    }

        case 2: {

        System.out.println("Qual Produto deseja buscar ?: ");
        String pesquisa = scanner.nextLine().toLowerCase();

        ArrayList<Produto> encontrados = new ArrayList<>();

        for(Produto produto : produtos){
            if(produto.nome.toLowerCase().contains(pesquisa)){
                encontrados.add(produto);
                
            }
        }

        for(Produto produto : encontrados){
            System.out.println(produto.nome);

        }

        break;

    }

        case 3:

        int i = 0;
        

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
        break;

        case 4:

        escolha = 2;

        break;


    }

        } while(escolha != 4);


}

    
}

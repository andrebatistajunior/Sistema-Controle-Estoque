import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {
    
int escolha;


Scanner scanner = new Scanner(System.in);

public ArrayList<Produto> produtos = new ArrayList<>();

public void cadastrarProduto(){

            do{


        System.out.println("Escolha uma opção: \n1- CADASTRAR PRODUTO  \n2- PESQUISAR UM PRODUTO \n3- DESEJA VER TODOS OS PRODUTOS CADASTRADOS ? \n4- ADICIONAR AO ESTOQUE \n5- RETIRAR DO ESTOQUE \n6- SAIR");
        
        escolha = scanner.nextInt();

        scanner.nextLine();

        switch(escolha){

        case 1: {

        Produto produto = new Produto();

        System.out.print("Informe o nome do produto: ");

        String nome = scanner.nextLine();

        produto.nome = nome;

        produto.cadastrarEstoque();

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

            Produto produto = produtos.get(i);

            System.out.println("Produto " + (i + 1));
            System.out.println(produto.nome);
            System.out.println(produto.getQuantidade());
            System.out.println(produto.preco);

            if(produto.estoque_baixo == true){
                System.out.println("Estoque baixo.");

            }if(produto.estoque_baixo == false){
                System.out.println("Estoque Normal");
            }
        }
        break;

        case 4:

        
        System.out.println("Qual Produto você quer adicionar a mais no estoque ?: ");
        
        for (Produto produto : produtos){
            System.out.println(produto.nome);
        }

        System.out.println("\n");

        System.out.println("Produto: ");
        String pesquisa = scanner.nextLine().toLowerCase();

        for(Produto produto : produtos){
            if(pesquisa.equals(produto.nome.toLowerCase())){
                produto.adicionarEstoque();

            }

        }


        
        break;


        case 5:
        
        System.out.println("Qual Produto você quer retirar do estoque ?: ");
        
        for (Produto produto : produtos){
            System.out.println(produto.nome);
        }

        System.out.println("\n");

        System.out.println("Produto: ");
        pesquisa = scanner.nextLine().toLowerCase();

        for(Produto produto : produtos){
            if(pesquisa.equals(produto.nome.toLowerCase())){
                produto.retirarEstoque();

            }
        }

        break;

        case 6:

        break;


        }

        } while(escolha != 6);


    }

    
}



import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args){


        int i = 0;
        
        
        ArrayList<ProdutoService> produtos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int escolha;

        
    
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

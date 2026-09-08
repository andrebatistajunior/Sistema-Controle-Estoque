
import java.util.Scanner;

public class Produto{
    public String nome;
    private int quantidade;
    public double preco;
    public boolean estoque_baixo;

    ProdutoService service = new ProdutoService();

    public void cadastrarEstoque(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade do produto disponível: ");

        quantidade = scanner.nextInt();
    
        if(quantidade <= 20){
            estoque_baixo = true;

        }if(quantidade > 20){
            estoque_baixo = false;

        }

    }

 
    public void adicionarEstoque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O Quanto quer adicionar no estoque ?: ");
        int adicionar = scanner.nextInt();

        quantidade += adicionar;

    }

    public void retirarEstoque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade que deseja retirar no estoque: ");
        int retirar = scanner.nextInt();

        quantidade = quantidade - retirar;

    }

    public int getQuantidade(){

            return quantidade;
    }





}


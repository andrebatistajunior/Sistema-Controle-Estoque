
public class Main {


    public static void main(String[] args){

        int i = 0;

        ProdutoService service = new ProdutoService();
        service.cadastrarProduto();
        

        
        for( i = 0 ; i < service.produtos.size(); i++){
            System.out.println("Produto " + (i + 1));
            System.out.println(service.produtos.get(i).nome);
            System.out.println(service.produtos.get(i).quantidade);
            System.out.println(service.produtos.get(i).preco);
            if(service.produtos.get(i).estoque_baixo == true){
                System.out.println("Estoque baixo.");
            }if(service.produtos.get(i).estoque_baixo == false){
                System.out.println("Estoque Normal");
            }
        }

       
    

    }

    
}

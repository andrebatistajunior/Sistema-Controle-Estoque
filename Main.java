public class Main {
    public static void main(String[] args){
        Produto produto1 = new Produto();

        produto1.nome = "MousePad Gamer LongTech";
        produto1.quantidade = 30;
        produto1.preco = 89.99;

        System.out.println("Nome do Produto: " + produto1.nome);
        System.out.println("Quantidade: " + produto1.quantidade);
        System.out.println("Preço: R$ " + produto1.preco);


    }
    
}

package q01;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel");
        Pedido pedido = new Pedido(1, 50);
        Pedido pedido2 = new Pedido(2, 100);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente);
        carrinho.processarPedido(pedido);
        carrinho.processarPedido(pedido2);
        carrinho.getCarrinho();
    }
}
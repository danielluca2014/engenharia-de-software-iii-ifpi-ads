package q01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Pedido> pedidos;
    private Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente){
        this.cliente = cliente;
        this.pedidos = new ArrayList<>();
    }

    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorTotal() * 0.1;
    }

    public void processarPedido(Pedido pedido) {
        pedidos.add(pedido);
        calcularDesconto(pedido);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void getCarrinho() {
        for (Pedido pedido : pedidos){
            System.out.println(pedido.getId());
        }
    }
}

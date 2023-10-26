package q01;
public class Pedido {
    private int id;
    private double valorTotal;
    
    public Pedido(int id, double valorTotal){
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}

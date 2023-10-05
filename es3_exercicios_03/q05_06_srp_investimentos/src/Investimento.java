public class Investimento implements Auditavel {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;

    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }

    public String getStatusRisco() {
        return statusRisco;
    }

    public void executarAuditoria() {
        // Lógica aqui...
    }
}

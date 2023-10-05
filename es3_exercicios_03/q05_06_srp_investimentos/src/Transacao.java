public class Transacao implements Auditavel {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
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

    public TipoTransacao getTipo() {
        return tipo;
    }

    public boolean isFraudulenta() {
        // Implemente a lógica para verificar se a transação é fraudulenta
        // Por simplicidade, retornamos sempre falso aqui
        return false;
    }

    public void executarAuditoria() {
        // Lógica aqui...
    }
}

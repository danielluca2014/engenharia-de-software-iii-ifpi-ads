import java.util.List;

public class ContaCorrente implements Auditavel {
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void executarAuditoria() {
        // Lógica aqui...
    }
}

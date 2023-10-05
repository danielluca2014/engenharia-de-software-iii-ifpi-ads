import java.util.List;

public class ContaCorrenteService {
      public List<Transacao> filtrarTransacoesInvalidas(ContaCorrente conta) {
        // Implemente a lógica para filtrar transações inválidas
        // Por simplicidade, retornamos todas as transações aqui
        return conta.getTransacoes();
    }
}

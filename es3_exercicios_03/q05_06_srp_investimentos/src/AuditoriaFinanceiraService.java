import java.util.List;

public class AuditoriaFinanceiraService {
    public void executar(List<Auditavel> auditaveis) {
        for (Auditavel auditavel : auditaveis) {
            auditavel.executarAuditoria();
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class ValidacaoImpostoDeRenda {
    public List<Validacao> validacoes;

    public ValidacaoImpostoDeRenda() {
        validacoes = new ArrayList<>();
    }

    public void adicionarValidacao(Validacao validacao) {
        validacoes.add(validacao);
    }

    public boolean validar(ImpostoDeRenda imposto) {
        List<Boolean> resultados = new ArrayList<>();

        for (Validacao validacao : validacoes) {
            boolean resultado = validacao.validar(imposto);
            resultados.add(resultado);
        }

        return resultados.stream().allMatch(r -> r == true);
    }
}

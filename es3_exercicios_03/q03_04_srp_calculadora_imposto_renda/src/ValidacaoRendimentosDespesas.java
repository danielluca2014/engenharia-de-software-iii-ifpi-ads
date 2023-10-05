public class ValidacaoRendimentosDespesas implements Validacao {
    public boolean validar(ImpostoDeRenda imposto) {
        if (imposto.getRendimentos().stream().anyMatch(valor -> valor < 0) || imposto.getDespesas().stream().anyMatch(valor -> valor < 0)) {
            System.out.println("Rendimentos ou despesas não podem ser negativos");
            return false;
        }
        return true;
    }
}

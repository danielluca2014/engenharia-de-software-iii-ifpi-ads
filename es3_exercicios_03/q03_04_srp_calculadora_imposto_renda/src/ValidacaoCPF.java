public class ValidacaoCPF implements Validacao {
    public boolean validar(ImpostoDeRenda imposto) {
        if (imposto.getCpfContribuinte() == null || imposto.getCpfContribuinte().isEmpty() || imposto.getCpfContribuinte().length() != 11) {
            System.out.println("CPF inválido");
            return false;
        }
        return true;
    }
}

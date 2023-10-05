public class ValidacaoNumeroRendimentos implements Validacao {
    public boolean validar(ImpostoDeRenda imposto) {
        if (imposto.getRendimentos().size() > 5) {
            System.out.println("Não podem existir mais que 5 rendimentos");
            return false;
        }
        return true;
    }
}

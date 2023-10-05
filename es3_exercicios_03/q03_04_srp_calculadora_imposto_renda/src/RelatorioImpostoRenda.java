public class RelatorioImpostoRenda {
    private ImpostoDeRenda impostoDeRenda;

    public RelatorioImpostoRenda(ImpostoDeRenda impostoDeRenda) {
        this.impostoDeRenda = impostoDeRenda;
    }

    public void gerarRelatorio(double impostoDevido) {
        System.out.println("CPF: " + impostoDeRenda.getCpfContribuinte());
        System.out.println("Rendimentos: " + impostoDeRenda.getRendimentos());
        System.out.println("Despesas: " + impostoDeRenda.getDespesas());
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}

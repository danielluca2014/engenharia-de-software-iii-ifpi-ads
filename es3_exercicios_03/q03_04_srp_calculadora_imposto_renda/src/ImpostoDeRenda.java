import java.util.List;

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public String getCpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public List<Double> getDespesas() {
        return despesas;
    }

    public void processar() {
        ValidacaoImpostoDeRenda validacao = new ValidacaoImpostoDeRenda();
        validacao.adicionarValidacao(new ValidacaoCPF());
        validacao.adicionarValidacao(new ValidacaoRendimentosDespesas());
        validacao.adicionarValidacao(new ValidacaoNumeroRendimentos());

        if (validacao.validar(this)) {
            CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
            double impostoDevido = calculadora.calcular(rendimentos, despesas);

            RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda(this);
            relatorio.gerarRelatorio(impostoDevido);
        }
    }
}

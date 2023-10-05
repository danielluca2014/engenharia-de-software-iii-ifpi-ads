3. Considere a classe abaixo:

import java.util.List;

```java
class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;


     public ImpostoDeRenda(String cpfContribuinte,
                          List<Double> rendimentos,
                          List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }


    public double calcularImposto() {
        double rendaTotal =
                          rendimentos.stream().mapToDouble(Double::doubleValue).sum();
        double despesaTotal =
                          despesas.stream().mapToDouble(Double::doubleValue).sum();
        double baseCalculo = rendaTotal - despesaTotal;


        if (baseCalculo <= 1903.98) {
            return 0.0;
        }
        if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 142.80;
        }
        // E assim por diante, para outros intervalos...


        return baseCalculo * 0.275 - 869.36; // Para bc acima de 4664.68
    }


    public void gerarRelatorio() {
        System.out.println("CPF: " + cpfContribuinte);
        System.out.println("Rendimentos: " + rendimentos);
        System.out.println("Despesas: " + despesas);
        System.out.println("Imposto Devido: " + calcularImposto());
    }
}
```

A classe viola o princípio SRP em dois pontos onde efetua cálculos e na geração de dados de saída. Proponha então uma refatoração da classe para que:

a. Exista uma classe chamada CalculadoraImpostoDeRenda que possua um método chamado calcular. Nesse método, são passados os rendimentos e as despesas e é feito o cálculo para diferentes valores da base de cálculo;

b. Crie outra classe para gerar a saída de tela onde são passadas a classe atual (this) ou os seus atributos e o cálculo do imposto já efetuado;

c. O método da classe ImpostoDeRenda.calcular() seja renomeado para processar() e que na sua definição sejam instanciados uma calculadora e relatório conforme abaixo:

```java
public class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;


    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos,
                           List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }


    public void processar() {
        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);


        RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    }
}
```

4. Suponha agora a classe ImpostoDeRenda possua as seguintes validações
   executadas antes do cálculo no método processar:
    • CPF não pode ser vazio;
    • CPF tem que ter 11 caracteres;
    • Os rendimentos e despesas não podem ser negativos;
    • Não podem existir mais que 5 rendimentos;

    a. Implemente individualmente dentro do método processar essas validações;

    b. Refatore a classe ImpostoDeRenda novamente criando uma classe específica chamada ValidacaoImpostoDerenda ter um método com as validações conforme mostrado em sala de aula como forma de não ferir diretamente o SRP.

    c. Considerando que o número de validações pode ser “infinito” à medida que a necessidade de novas, refatore a classe acima para receber uma lista de validações e processá-las de acordo com o princípio Open Closed.

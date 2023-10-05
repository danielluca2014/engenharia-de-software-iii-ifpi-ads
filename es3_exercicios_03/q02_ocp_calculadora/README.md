2. A classe Calculadora abaixo possui o método calcular com possibilidade de crescer “infinitamente”, ferido ao princípio Open Closed (OCP): import java.util.List;

```java
public class Calculadora {
    private final double a;
    private final double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcular(List<String> operacoes) {

        List<Double> resultados = new ArrayList<>();

        for (String operacao : operacoes) {
            switch (operacao) {
                case "soma":
                        resultados.add(this.a + this.b);
                        break;
                case "subtracao":
                        resultados.add(this.a - this.b);
                        break;
                // case "multiplicacao":
                //      resultados.add(this.a * this.b);
                //      break;
                default:
                        throw new IllegalArgumentException("Operação não suportada: " + operacao);
            }
        }

        return resultados;
    }
}
```

Dessa forma, refatore a implementação da seguinte forma:
a. Crie uma interface Operacao que possui um método executar() onde dois parâmetros são recebidos;
b. Implemente a interface para cada uma das operações possíveis;
c. Refatore o método calcular para coerente com o OCP recebendo uma lista de operações e adicionando à lista de resultados o resultado de cada método executar da Operacao em questão.

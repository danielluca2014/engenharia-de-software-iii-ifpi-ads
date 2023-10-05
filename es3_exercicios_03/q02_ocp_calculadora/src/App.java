import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(5, 2);

        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();

        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(soma);
        operacoes.add(subtracao);
        operacoes.add(multiplicacao);

        List<Double> resultados = calculadora.calcular(operacoes);

        System.out.println(resultados);
    }
}

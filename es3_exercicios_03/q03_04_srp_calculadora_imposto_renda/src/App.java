import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> rendimentos = new ArrayList<>(Arrays.asList(50000.0, 10000.0, 15000.0));
        List<Double> despesas = new ArrayList<>(Arrays.asList(8000.0, 5000.0, 2000.0));

        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda("12345678985", rendimentos, despesas);

        impostoDeRenda.processar();
    }
}

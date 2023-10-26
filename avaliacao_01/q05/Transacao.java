package q05;

import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private double valor;

    public Transacao(double valor) {
        this.valor = valor;
    }

    public List<Double> calcularTaxas(List<Taxas> taxas) {
        List<Double> resultadisTaxa = new ArrayList<>();
        
        for (Taxas taxa : taxas) {
            resultadisTaxa.add(taxa.calcularTaxas(valor));
        }

        return resultadisTaxa;
    }

    public double getValor(){
        return valor;
    }
}

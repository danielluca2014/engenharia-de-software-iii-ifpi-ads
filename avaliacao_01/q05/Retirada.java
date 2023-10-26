package q05;

public class Retirada implements Taxas {
    @Override
    public double calcularTaxas(double valor){
        return valor * 0.02;
    }
}

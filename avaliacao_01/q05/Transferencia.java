package q05;

public class Transferencia implements Taxas {
    @Override
    public double calcularTaxas(double valor){
        return valor * 0.015;
    }
}

package q05;

public class Deposito implements Taxas {
    @Override
    public double calcularTaxas(double valor){
        return valor * 0.01;
    }

}
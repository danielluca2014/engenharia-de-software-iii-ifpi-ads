package q0304;

public class Carro {
    double quantidadeCombustivel;
    double capacidadeMaxima = 50; // em litros

    public Carro(double quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void reabastecerSeNecessario(int quantidade) throws Exception {
        if (this.quantidadeCombustivel > this.capacidadeMaxima * 0.1) {
            throw new Exception("Quantidade ainda suficiente...");
        }
        
        if ((quantidadeCombustivel + quantidade) >= this.capacidadeMaxima) {
            throw new Exception("Capacidade ultrasassada...");
        }

        this.quantidadeCombustivel += quantidade;
    }
}


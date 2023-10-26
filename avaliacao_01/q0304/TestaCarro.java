package q0304;

class TestaCarro {
    public static void main(String[] args) throws Exception {
      Carro carrinho =  new Carro(5);
      carrinho.reabastecerSeNecessario(50);
      System.out.println(carrinho.capacidadeMaxima);
    }
}
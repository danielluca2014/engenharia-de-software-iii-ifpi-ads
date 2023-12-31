5. As classes abaixo violam o SRP conforme comentários:

```java
import java.util.List;

enum TipoInvestimento {
    RENDA_FIXA, RENDA_VARIAVEL
}

enum TipoTransacao {
    CREDITO, DEBITO
}

class ContaCorrente {
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // Método que viola o SRP, pois filtrar transações não é responsabilidade de ContaCorrente

    public List<Transacao> filtrarTransacoesInvalidas() {
        // ... implemente a lógica para filtrar transações inválidas
        return transacoesInvalidas;
    }


    public String getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }
}

class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;

    
    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    // Método que viola o SRP, pois avaliar risco não é responsabilidade do investimento

    public String avaliarRisco() {
        // ... implemente a lógica para avaliar o risco do investimento
        return statusRisco;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }
}

class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    // Método que viola o SRP, pois verificar fraude não é responsabilidade da transação

    public boolean verificarFraude() {
        // ... implemente a lógica para verificar se a transação é fraudulenta
        return isFraudulenta;
    }


    public int getId() {
        return id;
    }


    public double getValor() {
        return valor;
    }


    public TipoTransacao getTipo() {
        return tipo;
    }
}
```
Com base nas implementações, proponha a codificação dos métodos que ferem o SRP e segregue tais alterações/responsabilidades em métodos de 3 classes:
ContaCorrenteService, InvestimentoService e TransacaoService.

6. Considerando ainda as classes anteriores, a classe abaixo fere o OCP:
   
```java
class AuditoriaFinanceiraService {
      public void executar(List<ContaCorrente> contas,
                          List<Investimento> investimentos,
                          List<Transacao> transacoes) {
         // Auditoria para Conta Corrente
         for(ContaCorrente conta : contas) {
             // Lógica de auditoria para Conta Corrente...
         }


         // Auditoria para Investimento
         for(Investimento investimento : investimentos) {
             // Lógica de auditoria para Investimento...
         }


         // Auditoria para Transacao
         for(Transacao transacao : transacoes) {
             // Lógica de auditoria para Transacao...
         }
     }
}
```
Implemente de forma livre as lógicas de auditorias das 3 classes. Refatore posteriormente a implementação com o que for necessário para que seja passada apenas uma lista de “auditáveis” no método executar, deixando assim a classe de acordo com o OCP.


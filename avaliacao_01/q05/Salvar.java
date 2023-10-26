package q05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Salvar {
     public void salvarTransacao(Transacao transacao) {
        try (FileWriter writer = new FileWriter("log_transacoes.txt", true)) {
            writer.write("Data: " + new Date() + ", Valor: " + transacao.getValor() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a transação: " + e.getMessage());
        }
    }
}

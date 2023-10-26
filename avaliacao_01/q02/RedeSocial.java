package q02;

public class RedeSocial {
    public void postarMensagem(String mensagem) throws Exception {
        if (mensagem == null || mensagem.trim().equals("")) {
            throw new Exception("A mensagem não pode ser vazia...");
        }

        System.out.println("Mensagem postada: " + mensagem);
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ControladorDeArquivos {
    private String filePath;

    public ControladorDeArquivos(String filePath) {
        this.filePath = filePath;
    }

    public void saveToFile(List<Post> posts) {
        try {
            FileWriter writer = new FileWriter(filePath);
            for (int i = 0; i < posts.size(); i++) {
                Post post = posts.get(i);
                writer.write("ID: " + post.getId() + "\n");
                writer.write("Texto: " + post.getTexto() + "\n");
                writer.write("Autor: " + post.getAutor().getNome() + "\n");
                writer.write("Data: " + post.getData() + "\n");
                writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
                writer.write("\n"); 
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
         try {
            FileReader arq = new FileReader(filePath);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine();
            }
            
            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
    }
}

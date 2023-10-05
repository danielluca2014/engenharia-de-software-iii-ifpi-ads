import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor(1, "Daniel Luca", "daniel_luca@email.com");
        Post post1 = new Post(1, "Bom dia.", autor, new Date());
        Post post2 = new Post(2, "Boa noite.", autor, new Date());

        RepositorioDePosts repositorio = new RepositorioDePosts();
        ControladorDeArquivos fileHandler = new ControladorDeArquivos("posts.txt");

        repositorio.adicionarPost(post1);
        repositorio.adicionarPost(post2);

        fileHandler.saveToFile(repositorio.getPosts());

        System.out.printf("\nConteúdo salvo:\n");
        fileHandler.readFile();

        System.out.println();
    }
}

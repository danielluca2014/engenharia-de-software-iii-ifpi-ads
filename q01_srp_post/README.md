1. A classe Post abaixo fere o Princípio da Responsabilidade Única (SRP) por ter duas responsabilidades: Ser uma classe de “modelo” além disso ter a responsabilidade de persistir dados.

```java
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Post {
    private int id;
    private String texto;
    private Autor autor;
    private Date data;
    private int quantidadeDeLikes;
    private String filePath; // Caminho do arquivo - responsabilidade extra


    public Post(int id, String texto, Autor autor, Date data, String filePath) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.data = new Date(data.getTime());
        this.quantidadeDeLikes = 0;
        this.filePath = filePath;
    }


    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getData() {
        return new Date(data.getTime());
    }

    public int getQuantidadeDeLikes() {
        return quantidadeDeLikes;
    }

    // Responsabilidade extra: Manipulação de Arquivo
    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + id + "\n");
            writer.write("Texto: " + texto + "\n");
            writer.write("Autor: " + autor.getNome() + "\n");
            writer.write("Data: " + data + "\n");
            writer.write("Quantidade de Likes: " + quantidadeDeLikes + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Autor {
    private int id;
    private String nome;
    private String email;

    public Autor(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Métodos de acesso (getters) aqui.
}
```

Refaça a implementação delegando a uma classe RepositorioDePosts a responsabilidade de persistir os dados. Crie uma classe para testes que instancie autores, posts e faça a escrita e adicionalmente a leitura de um post em arquivo.


import java.util.ArrayList;
import java.util.List;

public class RepositorioDePosts {
    private List<Post> posts;
   
    public RepositorioDePosts() {
        posts = new ArrayList<>();
    }

    public void adicionarPost(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}

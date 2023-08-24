### 1\. Aplique o princípio “Tell, don’t ask” no próprio método publish da classe Post do slide 18. Crie um método chamado validate() que encapsula as validações existentes e chame-o.

<details>
<summary> Antes </summary>

##### Post.java
```java
enum Status {
    DRAFT,
    PUBLISHED,
    DELETED
}

public class Post {
    private int id;
    private String text;
    private Status status;

    Post(int id, String text, Status status) {
        this.setId(id);
        this.setText(text);
        this.setStatus(status);
    }

    public void publish() {
        if (this.getStatus() != Status.DRAFT) {
            throw new RuntimeException("Only drafts can be posted");
        }

        if (this.getText().trim().length() == 0) {
            throw new RuntimeException("A post must have at least one character");
        }
        this.setStatus(Status.PUBLISHED);
    } 

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
    
}

```
##### RedeSocial.java
```java
public class RedeSocial {
    public static void main(String[] args) {
        Post post = new Post(1, "Hello Word", Status.DRAFT);

        post.publish();
        System.out.println("Successfully published text");
    }
} 
```
</details>

<details>
<summary> Depois </summary>

##### Post.java
```java
  enum Status {
      DRAFT,
      PUBLISHED,
      DELETED
  }
  
  public class Post {
      private int id;
      private String text;
      private Status status;
  
      Post(int id, String text, Status status) {
        this.setId(id);
        this.setText(text);
        this.setStatus(status);
      }
  
      public void publish() {
        validate();
        this.setStatus(Status.PUBLISHED);
      }
  
      private void validate() {
  		  if (this.getStatus() != Status.DRAFT) {
          throw new RuntimeException("Only drafts can be posted");
        }
  
        if (this.getText().trim().length() == 0) {
          throw new RuntimeException("A post must have at least one character");
        }
      }
  
      public String getText() {
  		  return text;
  	  }
  
  	  public void setText(String text) {
  		  this.text = text;
  	  }
  
  	  public int getId() {
  		  return id;
  	  }
  
  	  public void setId(int id) {
  		  this.id = id;
  	  }
  
  	  public Status getStatus() {
  		  return status;
  	  }
  
  	  public void setStatus(Status status) {
  		  this.status = status;
  	  }
    }

```
##### RedeSocial.java
```java
public class RedeSocial {
    public static void main(String[] args) {
        Post post = new Post(1, "Hello Word", Status.DRAFT);

        post.publish();
        System.out.println("Successfully published text");
    }
} 
```
</details>

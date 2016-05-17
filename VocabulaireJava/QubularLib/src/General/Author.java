package General;

/**
 * Created by sentosh1ne on 16.05.2016.
 */
public class Author {
    int id;
    String status;
    String username;

    public Author(int id, String status, String username) {
        this.id = id;
        this.status = status;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

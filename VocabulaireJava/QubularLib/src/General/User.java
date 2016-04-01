package General;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class User {

    public int id;
    public String userName;
    public Status status;

    public enum Status{
        Regular,
        BoardMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!userName.equals(user.userName)) return false;
        return status == user.status;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userName.hashCode();
        result = 31 * result + status.hashCode();
        return result;
    }
}

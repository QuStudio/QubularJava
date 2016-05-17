package General;

import Lexeme.ForeignLexeme;
import Lexeme.NativeLexeme;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class Entry {

    public int id;
    public Author author;
    public ForeignLexeme foreign;
    public NativeLexeme[] natives;
    public User user;

    public Entry(int id, ForeignLexeme foreignLexeme, NativeLexeme[] nativeLexemeList, User user) {
        this.id = id;
        this.foreign = foreignLexeme;
        this.natives = nativeLexemeList;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;

        Entry entry = (Entry) o;

        if (id != entry.id) return false;
        if (!author.equals(entry.author)) return false;
        if (!foreign.equals(entry.foreign)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(natives, entry.natives)) return false;
        return user.equals(entry.user);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + author.hashCode();
        result = 31 * result + foreign.hashCode();
        result = 31 * result + Arrays.hashCode(natives);
        result = 31 * result + user.hashCode();
        return result;
    }
}

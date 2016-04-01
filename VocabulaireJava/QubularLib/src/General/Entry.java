package General;

import Lexeme.ForeignLexeme;
import Lexeme.NativeLexeme;

import java.util.List;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class Entry {

    public int id;
    public ForeignLexeme foreignLexeme;
    public List<NativeLexeme> nativeLexemeList;
    public User user;

    public Entry(int id, ForeignLexeme foreignLexeme, List<NativeLexeme> nativeLexemeList, User user) {
        this.id = id;
        this.foreignLexeme = foreignLexeme;
        this.nativeLexemeList = nativeLexemeList;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;

        Entry entry = (Entry) o;

        if (id != entry.id) return false;
        if (!foreignLexeme.equals(entry.foreignLexeme)) return false;
        if (!nativeLexemeList.equals(entry.nativeLexemeList)) return false;
        return user.equals(entry.user);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + foreignLexeme.hashCode();
        result = 31 * result + nativeLexemeList.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}

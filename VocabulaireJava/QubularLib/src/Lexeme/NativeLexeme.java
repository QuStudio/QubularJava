package Lexeme;

import Morpheme.Morpheme;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class NativeLexeme implements Lexeme {

    public Morpheme lemma;
    public String meaning;
    public Usage usage;

    public enum Usage{
        General,
        Promising,
        Rare;



        public int getPriority(){
            switch(this){
                case General:
                    return 1;
                case Promising:
                    return 2;
                case Rare:
                    return 3;
            }
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NativeLexeme)) return false;

        NativeLexeme that = (NativeLexeme) o;

        if (!lemma.equals(that.lemma)) return false;
        if (meaning != null ? !meaning.equals(that.meaning) : that.meaning != null) return false;
        return usage == that.usage;

    }

    @Override
    public int hashCode() {
        int result = lemma.hashCode();
        result = 31 * result + (meaning != null ? meaning.hashCode() : 0);
        result = 31 * result + usage.hashCode();
        return result;
    }
}

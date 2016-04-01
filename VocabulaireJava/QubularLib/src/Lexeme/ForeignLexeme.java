package Lexeme;

import Morpheme.Morpheme;

import java.util.Collections;
import java.util.List;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class ForeignLexeme implements Lexeme,Comparable<ForeignLexeme>{

    public Morpheme lemma;
    public List<Morpheme> forms;
    public Morpheme origin;
    public String meaning;
    public Permissibility permissibility;

    @Override
    public int compareTo(ForeignLexeme o) {
        return this.permissibility.getPriority() - o.permissibility.getPriority();
    }



    @Override
    public <T> void sortByPriority(List<T> lexemes) {
        List<ForeignLexeme> lexemeList;
        try{
           lexemeList = (List<ForeignLexeme>) lexemes;
           Collections.sort((List<ForeignLexeme>)lexemes);
        }catch (ClassCastException ex){

        }

    }

    public enum Permissibility{
        Allowed,
        GenerallyAllowed,
        NotRecommended,
        NotAllowed;

        public int getPriority(){
            switch(this){
                case Allowed:
                    return 1;
                case GenerallyAllowed:
                    return 2;
                case NotRecommended:
                    return 3;
                case NotAllowed:
                    return 4;
            }
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForeignLexeme)) return false;

        ForeignLexeme that = (ForeignLexeme) o;

        if (!lemma.equals(that.lemma)) return false;
        if (!forms.equals(that.forms)) return false;
        if (!origin.equals(that.origin)) return false;
        if (meaning != null ? !meaning.equals(that.meaning) : that.meaning != null) return false;
        return permissibility == that.permissibility;

    }

    @Override
    public int hashCode() {
        int result = lemma.hashCode();
        result = 31 * result + forms.hashCode();
        result = 31 * result + origin.hashCode();
        result = 31 * result + (meaning != null ? meaning.hashCode() : 0);
        result = 31 * result + permissibility.hashCode();
        return result;
    }
}

package Lexeme;

import Morpheme.Morpheme;

import java.util.Collections;
import java.util.List;

/**
 * Created by sentosh1ne on 01.04.2016.
 */

public class NativeLexeme implements Lexeme,Comparable<NativeLexeme> {

    public Morpheme lemma;
    public String meaning;
    public UsageType usageType;

    public NativeLexeme(Morpheme lemma, String meaning,UsageType usageType){
        this.lemma = lemma;
        this.meaning = meaning;
        this.usageType = usageType;
    }

    @Override
    public int compareTo(NativeLexeme o) {
        return this.usageType.getPriority() - o.usageType.getPriority();
    }

    public enum UsageType {
        General,
        Promising,
        Rare,
        Fancy;

        public int getPriority(){
            switch(this){
                case General:
                    return 1;
                case Promising:
                    return 2;
                case Fancy:
                    return 3;
                case Rare:
                    return 4;
            }
            return 1;
        }
    }

    public Morpheme getLemma() {
        return lemma;
    }

    public void setLemma(Morpheme lemma) {
        this.lemma = lemma;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public void setUsageType(UsageType usageType) {
        this.usageType = usageType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NativeLexeme)) return false;

        NativeLexeme that = (NativeLexeme) o;

        if (!lemma.equals(that.lemma)) return false;
        if (meaning != null ? !meaning.equals(that.meaning) : that.meaning != null) return false;
        return usageType == that.usageType;

    }

    @Override
    public int hashCode() {
        int result = lemma.hashCode();
        result = 31 * result + (meaning != null ? meaning.hashCode() : 0);
        result = 31 * result + usageType.hashCode();
        return result;
    }
}

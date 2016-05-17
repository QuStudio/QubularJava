package Morpheme;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class Morpheme {

    private String string;
    public Kind type;

    public enum Kind{
        @SerializedName("general")
        General,
        @SerializedName("case-sensetive")
        CaseSensetive;
    }

    public Morpheme(String string,Kind type){
        this.type = type;

        switch (type){
            case General:
                this.string = string.toLowerCase();
            case CaseSensetive:
                this.string = string;
        }
    }

    public String getString() {
        switch (type) {
            case General:
                return string.toUpperCase();
            case CaseSensetive:
                return string;
        }

        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Morpheme)) return false;

        Morpheme morpheme = (Morpheme) o;

        if (!string.equals(morpheme.string)) return false;
        return type == morpheme.type;

    }

    @Override
    public int hashCode() {
        int result = string.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}

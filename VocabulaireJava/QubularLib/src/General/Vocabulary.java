package General;

import java.util.List;

/**
 * Created by sentosh1ne on 01.05.2016.
 */
public class Vocabulary {
    private Entry[] entries;
    public static VocabularyVersion version;

    public static VocabularyVersion getDevelopVersion(){
        return new VocabularyVersion(0,0,0);
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void setEntries(Entry[] entries) {
        this.entries = entries;
    }

    public static VocabularyVersion getDevelop() {
        return version;
    }

    public static void setDevelop(VocabularyVersion develop) {
        Vocabulary.version = develop;
    }
}

package General;

import java.util.List;

/**
 * Created by sentosh1ne on 01.05.2016.
 */
public class Vocabulary {
    private List<Entry> entries;
    public static VocabularyVersion develop;

    public class VocabularyVersion{
        private int major;
        private int minor;
        private int patch;

        public VocabularyVersion(int major, int minor, int patch) {
            this.major = major;
            this.minor = minor;
            this.patch = patch;
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public static VocabularyVersion getDevelop() {
        return develop;
    }

    public static void setDevelop(VocabularyVersion develop) {
        Vocabulary.develop = develop;
    }
}

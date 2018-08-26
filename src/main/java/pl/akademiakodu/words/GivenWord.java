package pl.akademiakodu.words;

public class GivenWord {
    String word;
    String meaning;
    String onyomi;
    String kunyomi;
    String kanji;

    public GivenWord(String word) {
        this.word = word;
    }

    public GivenWord(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public GivenWord(String meaning, String onyomi, String kunyomi) {
        this.meaning = meaning;
        this.onyomi = onyomi;
        this.kunyomi = kunyomi;
    }

    public GivenWord(String word, String meaning, String kanji, String onyomi, String kunyomi) {
        this.word = word;
        this.meaning = meaning;
        this.onyomi = onyomi;
        this.kunyomi = kunyomi;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getOnyomi() { return onyomi; }

    public void setOnyomi(String onyomi) {
        this.onyomi = onyomi;
    }

    public String getKunyomi() {
        return kunyomi;
    }

    public void setKunyomi(String kunyomi) {
        this.kunyomi = kunyomi;
    }

}

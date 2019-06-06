public class TestWordCount {
    public static void main(String[] args) {
        WordCount w = new WordCount();
        w.wordCount("But tonight on this small planet we're going to rock civilisation");
    }
}

class WordCount {
    public void wordCount(String inputString) {
        System.out.println(inputString.split(" +").length);
    }
}
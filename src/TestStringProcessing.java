class StringProcessing {
    public void wordCounter(String msg) {
        String word = msg;
        int character = 0;
        while(character < msg.length()){
            if (msg.substring(character,character+1).equals(" ")){
                System.out.println(word);
                character++;
                word = "";
            }
        }
    }
}

public class TestStringProcessing {
    public static void main(String[] args) {
        StringProcessing s = new StringProcessing();
            s.wordCounter("Shafeeq is back");
    }
}

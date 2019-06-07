class StringProcessing {
    public void wordCount2(String msg) {
        String word = msg;
        int i = 0;
        while(i < msg.length()){
            if (msg.substring(i,i+1).equals(" ")){
                System.out.println(word);
                i++;
                word = "";
            }
        }
    }
}

public class TestStringProcessing {
    public static void main(String[] args) {
        StringProcessing s = new StringProcessing();
            s.wordCount2("Shafeeq is back");
    }
}

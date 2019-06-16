class College {
    private int phy, che, total;
    float percentage;
    private void calculations(){
        total = phy + che;
        percentage = total * 100 / 300;
    }

    public void Physics(int P) {
        if (P >= 0 && P <= 150) {
            phy = P;
        } else {
            phy = -1;
            System.out.println("Invalid Physics Marks");
        }
    }

    public void Chemistry(int C) {
        if (C >= 0 && C <= 150) {
            che = C;
        } else {
            che = -1;
            System.out.println("Invalid Chemistry Marks");
        }
    }

    public void showResults(){

        if (che == -1 || phy == -1) {
            System.out.println("No Results");
        } else {
            calculations();
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage:" + percentage);
        }
    }
}
public class TestMarksInput {
    public static void main(String[] args) {
        College abc;
        abc = new College();
        abc.Physics(70);
        abc.Chemistry(80);
        abc.showResults();
    }
}

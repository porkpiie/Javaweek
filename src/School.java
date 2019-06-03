class Results2 {
    private int phy, che, mat;

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

    public void Maths(int M) {
        if (M >= 0 && M <= 150) {
            mat = M;
        } else {
            mat = -1;
            System.out.println("Invalid Maths Marks");
        }
    }

    public void ShowResults2() {
        int total;
        if (phy == -1 || che == -1 || mat == -1) {
            System.out.println("No Results");
        }
        else{
            total = phy + che + mat;
            System.out.println("Result is: " + total);
        }
    }
}

public class School{
    public static void main(String[] args) {
        Results2 Peter, James;
        Peter= new Results2();
        James= new Results2();
        Peter.Maths(90);
        Peter.Chemistry(110);
        Peter.Physics(72);
        James.Maths(89);
        James.Chemistry(119);
        James.Physics(96);
        Peter.ShowResults2();
        James.ShowResults2();
    }
}
class Results2{
    int phy, che, mat;

    public void ShowResults2(){
        int total;
        total= phy + che + mat;
        System.out.println("Total Score: " + total);
        if (total > 300){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}

public class School{
    public static void main(String[] args) {
        Results2 Peter, James;
        Peter= new Results2();
        James= new Results2();
        Peter.mat = 50;
        Peter.che = 100;
        Peter.phy = 100;
        James.mat = 50;
        James.che = 50;
        James.phy = 70;
        Peter.ShowResults2();
        James.ShowResults2();
    }
}
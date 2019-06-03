class Results{
    public static void main(String args[]){
        int phy,che,mat,total;
        float per;
        phy = Integer.parseInt(args[0]);
        che = Integer.parseInt(args[1]);
        mat = Integer.parseInt(args[2]);
        total = phy + che + mat;
        per = total*100/450;
        System.out.println("Total marks: " + total);
        System.out.println(" Percentage: " + per);
        if (per>=60){
            System.out.println("You have passed the exam");
        }
        else{
            System.out.println("You have failed the exam");
        }
    }
}
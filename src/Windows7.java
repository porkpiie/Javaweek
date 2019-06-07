import java.awt.*;
import java.awt.event.*;

public class Windows7 {
    public static void main(String[] args) {
        Frame win = new Frame();
        Button B1 = new Button("The sum of all fears");
        B1.addActionListener(new Action1());
        Button B2 = new Button("This");
        B2.addActionListener(new Action2());
        Button B3 = new Button("is");
        B3.addActionListener(new Action3());
        Button B4 = new Button("a");
        B4.addActionListener(new Action4());
        Button B5 = new Button("rotato");
        B5.addActionListener(new Action5());
        win.add(B1, BorderLayout.CENTER);
        win.add(B2, BorderLayout.NORTH);
        win.add(B3, BorderLayout.EAST);
        win.add(B4, BorderLayout.SOUTH);
        win.add(B5, BorderLayout.WEST);
        win.setSize(400,400);
        win.setVisible(true);
        win.setBackground(Color.RED);
    }
}

class Action1 implements ActionListener{
    public void actionPerformed (ActionEvent x){
        System.out.println("What are we going to do...?");
    }

}

class Action2 implements ActionListener {
    public void actionPerformed(ActionEvent x) {
        System.out.println("This is an outrage");
    }
}

class Action3 implements ActionListener {
    public void actionPerformed(ActionEvent x) {
        System.out.println("Is this bass really strong enough?");
    }
}

class Action4 implements ActionListener {
    public void actionPerformed(ActionEvent x) {
        System.out.println("A quick brown fox jumped over the lazy dog");
    }
}

class Action5 implements ActionListener {
    public void actionPerformed(ActionEvent x) {
        System.out.println("YEAH You?");
    }
}
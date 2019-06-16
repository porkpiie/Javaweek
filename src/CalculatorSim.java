import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorSim {
    public static void main(String[] args) {
        Frame F = new Frame();
        Panel display = new Panel();
        Panel functions = new Panel();
        TextField T = new TextField(20);
        CalcHandler ch = new CalcHandler(T);
        Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9, btn_add, btn_sub, btn_multiply, btn_divide, btn_equals, btn_clear;
        B0 = new Button("0"); B0.addActionListener(ch); B0.setBackground(Color.RED); B0.setFont(new Font("Comic Sans", Font.BOLD,60));
        B1 = new Button("1"); B1.addActionListener(ch); B1.setBackground(Color.ORANGE); B1.setFont(new Font("Comic Sans", Font.BOLD,60));
        B2 = new Button("2"); B2.addActionListener(ch); B2.setBackground(Color.YELLOW); B2.setFont(new Font("Comic Sans", Font.BOLD,60));
        B3 = new Button("3"); B3.addActionListener(ch); B3.setBackground(Color.GREEN); B3.setFont(new Font("Comic Sans", Font.BOLD,60));
        B4 = new Button("4"); B4.addActionListener(ch); B4.setBackground(Color.BLUE); B4.setFont(new Font("Comic Sans", Font.BOLD,60));
        B5 = new Button("5"); B5.addActionListener(ch); B5.setBackground(new Color(75,0,130)); B5.setFont(new Font("Comic Sans", Font.BOLD,60));
        B6 = new Button("6"); B6.addActionListener(ch); B6.setBackground(new Color(199, 21,133)); B6.setFont(new Font("Comic Sans", Font.BOLD,60));
        B7 = new Button("7"); B7.addActionListener(ch); B7.setBackground(Color.RED); B7.setFont(new Font("Comic Sans", Font.BOLD,60));
        B8 = new Button("8"); B8.addActionListener(ch); B8.setBackground(Color.ORANGE); B8.setFont(new Font("Comic Sans", Font.BOLD,60));
        B9 = new Button("9"); B9.addActionListener(ch); B9.setBackground(Color.YELLOW);B9.setFont(new Font("Comic Sans", Font.BOLD,60));
        btn_add = new Button("+"); btn_add.addActionListener(ch); btn_add.setBackground(Color.GREEN); btn_add.setFont(new Font("Comic Sans", Font.BOLD,60));
        btn_sub = new Button("-"); btn_sub.addActionListener(ch); btn_sub.setBackground(Color.BLUE); btn_sub.setFont(new Font("Comic Sans", Font.BOLD,60));
        btn_multiply = new Button("x"); btn_multiply.addActionListener(ch); btn_multiply.setBackground(new Color(75,0,130)); btn_multiply.setFont(new Font("Comic Sans", Font.BOLD,60));
        btn_divide = new Button("/"); btn_divide.addActionListener(ch); btn_divide.setBackground(new Color(199, 21,133)); btn_divide.setFont(new Font("Comic Sans", Font.BOLD,60));
        btn_equals = new Button("="); btn_equals.addActionListener(ch); btn_equals.setBackground(Color.RED); B0.setFont(new Font("Comic Sans", Font.BOLD,60)); btn_equals.setFont(new Font("Comic Sans", Font.BOLD,60));
        btn_clear = new Button("C"); btn_clear.addActionListener(ch); btn_clear.setBackground(new Color(Color.HSBtoRGB(130.3f,64.4f,75.5f))); btn_clear.setFont(new Font("Comic Sans", Font.BOLD,60));
        GridLayout G = new GridLayout(4,4);
        display.add(T);

        functions.setLayout(G);
        functions.add(B0);
        functions.add(B1);
        functions.add(B2);
        functions.add(B3);
        functions.add(B4);
        functions.add(B5);
        functions.add(B6);
        functions.add(B7);
        functions.add(B8);
        functions.add(B9);
        functions.add(btn_add);
        functions.add(btn_sub);
        functions.add(btn_multiply);
        functions.add(btn_divide);
        functions.add(btn_equals);
        functions.add(btn_clear);
        F.setSize(600,600);
        F.add(display, BorderLayout.NORTH);
        F.add(functions, BorderLayout.CENTER);
        F.setVisible(true);
        F.setBackground(Color.BLUE);

    }
}

class CalcHandler implements ActionListener{

    Double answer;
    String operation;
    TextField resultField;

    public CalcHandler(TextField resultField){
        this.resultField = resultField;
    }

    public void actionPerformed(ActionEvent e) {
        String buttonLabel = ((Button)e.getSource()).getLabel();
        switch (buttonLabel){

            case "0":
                zero(); break;
            case "1":
                one(); break;
            case "2":
                two(); break;
            case "3":
                three(); break;
            case "4":
                four(); break;
            case "5":
                five(); break;
            case "6":
                six(); break;
            case "7":
                seven(); break;
            case "8":
                eight(); break;
            case "9":
                nine(); break;
            case "+":
                add(); break;
            case "-":
                subtract(); break;
            case "x":
                multiply(); break;
            case "/":
                division(); break;
            case "=":
                equals(); break;
            case "C":
                clear();
        }
    }
    private void zero(){
        resultField.setText(resultField.getText()+"0");
    }
    private void one(){
        resultField.setText(resultField.getText()+"1");

    }
    private void two(){
        resultField.setText(resultField.getText()+"2");
    }
    private void three(){
        resultField.setText(resultField.getText()+"3");
    }
    private void four(){
        resultField.setText(resultField.getText()+"4");
    }
    private void five(){
        resultField.setText(resultField.getText()+"5");
    }
    private void six(){
        resultField.setText(resultField.getText()+"6");
    }
    private void seven(){
        resultField.setText(resultField.getText()+"7");
    }
    private void eight(){
        resultField.setText(resultField.getText()+"8");
    }
    private void nine(){
        resultField.setText(resultField.getText()+"9");
    }
    private void add(){
        execute();
        operation = "+";
    }
    private void subtract(){
        execute();
        operation = "-";
    }
    private void multiply(){
        execute();
        operation = "x";
    }
    private void division(){
        execute();
        operation = "/";
    }
    private void equals(){
        execute();
        operation = "";
        resultField.setText("" + answer);
    }
    private void clear(){
        resultField.setText("");
        operation = "";
    }
    private void execute(){
        if (operation==null || operation.equals("")) {
            answer = Double.parseDouble("" + resultField.getText());
            resultField.setText("");
        } else {
            switch(operation) {
                case "+":
                    answer = answer + Double.parseDouble("" + resultField.getText());
                    resultField.setText("");
                    break;
                case "-":
                    answer = answer - Double.parseDouble("" + resultField.getText());
                    resultField.setText("");
                    break;
                case "x":
                    answer = answer * Double.parseDouble("" + resultField.getText());
                    resultField.setText("");
                    break;
                case "/":
                    answer = answer / Double.parseDouble("" + resultField.getText());
                    resultField.setText("");
            }
        }
    }
}

/*
138014 Mark Njore
131376 Jackson Lowasa
138464 Anthony Mutunga
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Calculator implements ActionListener{
    JFrame f;
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, bequal, badd, bsubtract, bmultiply, bdivide, bdelete,
    bpi, be, bsin, bcos, btan, bsinh, bcosh, btanh, bln, blog, bexp, brand, bsqrt, bcbrt, bsqr, bcube, bpower,
    b10x, binverse, bfactorial, broot, bpercent, bsign, bscientific;

    //Code to edit font in textfield
    Font font1 = new Font("SansSerif", Font.PLAIN, 45);

    static double a = 0, b = 0, answer = 0;
    static int operator = 0;

    Calculator(){
        f = new JFrame("Calculator");
        tf = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdec = new JButton(".");
        bdivide=new JButton("÷");
        bmultiply = new JButton("x");
        bsubtract = new JButton("-");
        badd = new JButton("+");
        bdelete = new JButton("C");
        bequal = new JButton("=");
        bpi = new JButton("π");
        be = new JButton("e");
        bsin = new JButton("sin");
        bcos = new JButton("cos");
        btan = new JButton("tan");
        bsinh = new JButton("sinh");
        bcosh = new JButton("cosh");
        btanh = new JButton("tanh");
        bln = new JButton("ln");
        blog = new JButton("log10");
        bexp = new JButton("e^x");
        brand = new JButton("Rand");
        bsqrt = new JButton("2√x");
        bcbrt = new JButton("3√x");
        bsqr = new JButton("x^2");
        bcube = new JButton("x^3");
        bpower = new JButton("x^y");
        b10x = new JButton("10^x");
        binverse = new JButton("1/x");
        broot = new JButton("y√x");
        bfactorial = new JButton("x!");
        bpercent = new JButton("%");
        bsign = new JButton("+/-");
        bscientific = new JButton("EE");

        //Code to position the buttons
        tf.setBounds(0,5,720,80);
        b7.setBounds(400,150,80,65);
        b8.setBounds(480,150,80,65);
        b9.setBounds(560,150,80,65);
        b4.setBounds(400,215,80,65);
        b5.setBounds(480,215,80,65);
        b6.setBounds(560,215,80,65);
        b1.setBounds(400,280,80,65);
        b2.setBounds(480,280,80,65);
        b3.setBounds(560,280,80,65);
        b0.setBounds(400,345,160,65);
        bdec.setBounds(560,345,80,65);
        bdivide.setBounds(640, 85, 80,65);
        bmultiply.setBounds(640, 150, 80, 65);
        bsubtract.setBounds(640, 215, 80, 65);
        badd.setBounds(640, 280, 80,65);
        bequal.setBounds(640,345,80,65);
        bdelete.setBounds(160, 85, 320, 65);
        bpi.setBounds(240, 345, 80, 65);
        be.setBounds(240, 280, 80, 65);
        bsin.setBounds(0, 280, 80, 65);
        bcos.setBounds(80, 280, 80, 65);
        btan.setBounds(160, 280, 80, 65);
        bsinh.setBounds(0, 345, 80, 65);
        bcosh.setBounds(80, 345, 80, 65);
        btanh.setBounds(160, 345, 80, 65);
        bln.setBounds(240, 215, 80, 65);
        blog.setBounds(320, 215, 80, 65);
        bexp.setBounds(240, 150, 80, 65);
        brand.setBounds(320, 345, 80, 65);
        bsqrt.setBounds(0, 215, 80, 65);
        bcbrt.setBounds(80, 215, 80, 65);
        bsqr.setBounds(0, 150, 80, 65);
        bcube.setBounds(80, 150, 80, 65);
        bpower.setBounds(160, 150, 80, 65);
        b10x.setBounds(320, 150, 80,65);
        binverse.setBounds(0, 85, 80,65);
        bfactorial.setBounds(80, 85, 80,65);
        broot.setBounds(160, 215, 80,65);
        bpercent.setBounds(560, 85, 80, 65);
        bsign.setBounds(480, 85, 80, 65);
        bscientific.setBounds(320, 280, 80, 65);

        //Code to add the buttons
        f.add(tf);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b0);
        f.add(bdec);
        f.add(bdivide);
        f.add(bmultiply);
        f.add(bsubtract);
        f.add(badd);
        f.add(bequal);
        f.add(bdelete);
        f.add(bpi);
        f.add(be);
        f.add(bsin);
        f.add(bcos);
        f.add(btan);
        f.add(bsinh);
        f.add(bcosh);
        f.add(btanh);
        f.add(bln);
        f.add(blog);
        f.add(bexp);
        f.add(brand);
        f.add(bsqrt);
        f.add(bcbrt);
        f.add(bsqr);
        f.add(bcube);
        f.add(bpower);
        f.add(b10x);
        f.add(binverse);
        f.add(bfactorial);
        f.add(broot);
        f.add(bpercent);
        f.add(bsign);
        f.add(bscientific);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(740,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        tf.setFont(font1);

        //Code to add ActionListerners to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdec.addActionListener(this);
        bdivide.addActionListener(this);
        bmultiply.addActionListener(this);
        bsubtract.addActionListener(this);
        badd.addActionListener(this);
        bdelete.addActionListener(this);
        bequal.addActionListener(this);
        bpi.addActionListener(this);
        be.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bsinh.addActionListener(this);
        bcosh.addActionListener(this);
        btanh.addActionListener(this);
        bln.addActionListener(this);
        blog.addActionListener(this);
        bexp.addActionListener(this);
        brand.addActionListener(this);
        bsqrt.addActionListener(this);
        bcbrt.addActionListener(this);
        bsqr.addActionListener(this);
        bcube.addActionListener(this);
        bpower.addActionListener(this);
        b10x.addActionListener(this);
        binverse.addActionListener(this);
        bfactorial.addActionListener(this);
        broot.addActionListener(this);
        bpercent.addActionListener(this);
        bsign.addActionListener(this);
        bscientific.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Code for number buttons
        if (e.getSource() == b1) {
            tf.setText(tf.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            tf.setText(tf.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            tf.setText(tf.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            tf.setText(tf.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            tf.setText(tf.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            tf.setText(tf.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            tf.setText(tf.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            tf.setText(tf.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            tf.setText(tf.getText().concat("9"));
        }
        if (e.getSource() == b0) {
            tf.setText(tf.getText().concat("0"));
        }
        //Code for delete button
        if (e.getSource() == bdelete) {
            tf.setText("");
        }
        //Code for constants and Rand
        if (e.getSource() == bpi) {
            tf.setText("3.141592653589793");
        }
        if (e.getSource() == be) {
            tf.setText("2.718281828459045");
        }
        if (e.getSource() == brand) {
            tf.setText("" + Math.random());
        }
        //Code for the decimal point
        if (e.getSource() == bdec) {
            if(tf.getText().contains(".")){
            }
            else{
                if(tf.getText().isEmpty()){
                    tf.setText(tf.getText().concat("0."));
                }
                else {
                    tf.setText(tf.getText().concat("."));
                }
            }
        }
        //Exception handling
        try {

            if (e.getSource() == badd) {
                a = Double.parseDouble(tf.getText());
                operator = 1;
                tf.setText("");
            }
            if (e.getSource() == bsubtract) {
                a = Double.parseDouble(tf.getText());
                operator = 2;
                tf.setText("");
            }
            if (e.getSource() == bmultiply) {
                a = Double.parseDouble(tf.getText());
                operator = 3;
                tf.setText("");
            }
            if (e.getSource() == bdivide) {
                a = Double.parseDouble(tf.getText());
                operator = 4;
                tf.setText("");
            }
            if (e.getSource() == bpower) {
                a = Double.parseDouble(tf.getText());
                operator = 5;
                tf.setText("");
            }
            if (e.getSource() == broot) {
                a = Double.parseDouble(tf.getText());
                operator = 6;
                tf.setText("");
            }
            if (e.getSource() == bscientific) {
                a = Double.parseDouble(tf.getText());
                operator = 7;
                tf.setText(" ");
            }

            if (e.getSource() == bequal) {
                b = Double.parseDouble(tf.getText());
                switch (operator) {
                    case 1:
                        answer = a + b;
                        break;
                    case 2:
                        answer = a - b;
                        break;
                    case 3:
                        answer = a * b;
                        break;
                    case 4:
                        answer = a / b;
                        break;
                    case 5:
                        answer = Math.pow(a, b);
                        break;
                    case 6:
                        answer = Math.pow(a, (1 / b));
                        break;
                    case 7:
                        answer = a * Math.pow(10, b);
                        break;
                    default:
                        answer = Double.parseDouble(tf.getText());
                }
                tf.setText("" + answer);
            }
            //Code for trigonometric buttons
            if (e.getSource() == bsin) {
                tf.setText("" + Math.sin(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == bcos) {
                tf.setText("" + Math.cos(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == btan) {
                tf.setText("" + Math.tan(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == bsinh) {
                tf.setText("" + Math.sinh(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == bcosh) {
                tf.setText("" + Math.cosh(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == btanh) {
                tf.setText("" + Math.tanh(Double.parseDouble(tf.getText())));
            }
            //Code for logs and exponential
            if (e.getSource() == bln) {
                tf.setText("" + Math.log(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == blog) {
                tf.setText("" + Math.log10(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == bexp) {
                tf.setText("" + Math.exp(Double.parseDouble(tf.getText())));
            }
            //Code for powers
            if (e.getSource() == bsqrt) {
                tf.setText("" + Math.sqrt(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == bcbrt) {
                tf.setText("" + Math.cbrt(Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == bsqr) {
                tf.setText("" + Math.pow(Double.parseDouble(tf.getText()), 2));
            }
            if (e.getSource() == bcube) {
                tf.setText("" + Math.pow(Double.parseDouble(tf.getText()), 3));
            }
            if (e.getSource() == b10x) {
                tf.setText("" + Math.pow(10, Double.parseDouble(tf.getText())));
            }
            if (e.getSource() == binverse) {
                tf.setText("" + 1 / Double.parseDouble(tf.getText()));
            }
            //Code for factorial button
            if (e.getSource() == bfactorial) {
                int i, f = 1;
                double number = Double.parseDouble(tf.getText());//It is the number to calculate factorial
                for (i = 1; i <= number; i++) {
                    f = f * i;
                }
                tf.setText("" + f);
            }
            //Code for percent button
            if (e.getSource() == bpercent) {
                tf.setText("" + Double.parseDouble(tf.getText()) / 100);
            }
            //Code for sign converter
            if (e.getSource() == bsign) {
                tf.setText("" + -(Double.parseDouble(tf.getText())));
            }
        }
        //Still exception handling
        catch(NumberFormatException ex){
            tf.setText("Syntax Error");
        }
    }
}

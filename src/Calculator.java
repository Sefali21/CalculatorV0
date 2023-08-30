import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JPanel panelBottom;
    private JFrame frame;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton btn_addieren;
    private JButton btn_subtraction;
    private JButton btn_multi;
    private JButton btn_division;
    private JButton btn_clr;
    private JButton btn_enter;
    private JButton btn_komma;


    Calculator(){
        setIcon();
        setButtons();

        setPanels();
        setPanelLeft();
        setPanelRight();

        setFrame();
        addFrame();
    }

    private void setFrame(){
        this.frame = new JFrame("Calculator");
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.setSize(500,500);
        this.frame.setLayout(new BorderLayout());
        this.frame.setVisible(true);


    }

    private void addFrame(){
        this.frame.add(this.panelTop, BorderLayout.NORTH);
        this.frame.add(this.panelLeft, BorderLayout.WEST);
        this.frame.add(this.panelRight, BorderLayout.EAST);
        this.frame.add(this.panelBottom, BorderLayout.SOUTH);
    }

    private void setPanels(){
        this.panelTop=new JPanel();
        this.panelLeft=new JPanel();
        this.panelRight=new JPanel();
        this.panelBottom=new JPanel();

        this.panelTop.setBackground(Color.lightGray);
        this.panelLeft.setBackground(Color.lightGray);
        this.panelRight.setBackground(Color.lightGray);
        this.panelBottom.setBackground(Color.lightGray);

        this.panelTop.setPreferredSize(new Dimension(500,50));
        this.panelLeft.setPreferredSize(new Dimension(400,430));
        this.panelRight.setPreferredSize(new Dimension(100,430));
        this.panelBottom.setPreferredSize(new Dimension(500,20));


    }

    private ImageIcon setIcon(){
        String path="src/keys.png";
        ImageIcon icon = new ImageIcon(path);
        return icon;
    }

    private void setButtons(){
        this.button0=new JButton("0");
        this.button1=new JButton("1");
        this.button2=new JButton("2");
        this.button3=new JButton("3");
        this.button4=new JButton("4");
        this.button5=new JButton("5");
        this.button6=new JButton("6");
        this.button7=new JButton("7");
        this.button8=new JButton("8");
        this.button9=new JButton("9");
        this.btn_clr=new JButton("clr");
        this.btn_enter=new JButton("Enter");
        this.btn_division=new JButton("/");
        this.btn_multi=new JButton("*");
        this.btn_addieren=new JButton("+");
        this.btn_subtraction=new JButton("-");
        this.btn_komma=new JButton(",");
    }

    private void setPanelLeft(){
        this.panelLeft.setLayout(new GridLayout(4,3,1,1));
        this.panelLeft.add(this.button7);
        this.panelLeft.add(this.button8);
        this.panelLeft.add(this.button9);

        this.panelLeft.add(this.button4);
        this.panelLeft.add(this.button5);
        this.panelLeft.add(this.button6);

        this.panelLeft.add(this.button1);
        this.panelLeft.add(this.button2);
        this.panelLeft.add(this.button3);

        this.panelLeft.add(this.btn_clr);
        this.panelLeft.add(this.button0);
        this.panelLeft.add(this.btn_komma);

    }

    private void setPanelRight(){
        this.panelRight.setLayout(new GridLayout(5,1,1,1));
        this.panelRight.add(this.btn_division);
        this.panelRight.add(this.btn_multi);
        this.panelRight.add(this.btn_subtraction);
        this.panelRight.add(this.btn_addieren);
        this.panelRight.add(this.btn_enter);

    }



}

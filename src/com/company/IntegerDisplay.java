package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//8진수 10진수 16진수로 수를 표시하고 버튼을 누르면 수의 증감을 처리하는 클래스
public class IntegerDisplay extends Frame implements ActionListener,ValueListener {
    private final Font font = new Font("Serif", Font.PLAIN, 30);

    private final Label octoLabel = new Label("0");
    private final Label decimalLabel = new Label("0");
    private final Label hexadecimalLabel = new Label("0");
    private final Button incrementButton  = new Button("+");
    private final Button decrementButton  = new Button("-");

    private Value value =new Value(0);

    private final Graph graphCircle =Graph.createGraph(Graph.CIRCLE,100,100);
    private final Graph graphRectangle =Graph.createGraph(Graph.RECTANGLE,100,150);

    public IntegerDisplay() {
        super("IntegerDisplay");
        setLayout(new BorderLayout());

        Panel panel =new Panel(new GridLayout(4,2));
        panel.add(new Label("Octal: ")).setFont(font);
        panel.add(octoLabel).setFont(font);
        panel.add(new Label("Decimal : ")).setFont(font);
        panel.add(decimalLabel).setFont(font);
        panel.add(new Label("Hexadecimal : ")).setFont(font);
        panel.add(hexadecimalLabel).setFont(font);
        panel.add(incrementButton).setFont(font);
        panel.add(decrementButton).setFont(font);

        add(panel,BorderLayout.NORTH);
        add(graphCircle,BorderLayout.CENTER);
        add(graphRectangle,BorderLayout.SOUTH);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);
        value.addValueListener(this);
        value.addValueListener(graphCircle);
        value.addValueListener(graphRectangle);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==incrementButton){
            setValue(value.getValue() +1);
        }else if(e.getSource() ==decrementButton){
            setValue(value.getValue() -1);
        }
    }

    public void setValue(int value){
        this.value.setValue(value);
    }
    public Value getValue(){return value;}

    @Override
    public void valueChanged(ValueChangeEvent e) {
        if(e.getSource() ==value){
            octoLabel.setText(Integer.toString(value.getValue(),8));
            decimalLabel.setText(Integer.toString(value.getValue(),10));
            hexadecimalLabel.setText(Integer.toString(value.getValue(),16));

        }
    }
}

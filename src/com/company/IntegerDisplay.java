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

    public IntegerDisplay() {
        super("IntegerDisplay");
        setLayout(new GridLayout(4,2));
        setPreferredSize(new Dimension(500,300));

        add(new Label("Octal:")).setFont(font);
        add(octoLabel);
        octoLabel.setFont(font);

        add(new Label("Decimal:")).setFont(font);
        add(decimalLabel);
        decimalLabel.setFont(font);

        add(new Label("Hexadcimal:")).setFont(font);
        add(hexadecimalLabel);
        hexadecimalLabel.setFont(font);

        add(incrementButton);
        add(decrementButton);

        incrementButton.addActionListener(this);
        incrementButton.setFont(font);
        decrementButton.addActionListener(this);
        incrementButton.setFont(font);

        value.addValueListener(this);

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

package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.Normalizer;

public class Form extends JFrame {
    public Form(){
        super("General form");
        super.setBounds(500,500,500, 470);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 1, 10, 10));

        JButton gehStofe = new JButton("Gehandhabte stofe");
        JButton gehBrenstofe = new JButton("Gehandhabte Brennstofe");
        JButton gehTierhaltung = new JButton("Tierhaltung");
        JButton emission = new JButton("Emissionen");
        JButton close = new JButton("CLOSE");

        container.add(gehStofe);
        container.add(gehBrenstofe);
        container.add(gehTierhaltung);
        container.add(emission);
        container.add(close);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        gehStofe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GehStofForm gehStofForm = new GehStofForm(Form.this);
                gehStofForm.setVisible(true);
                setVisible(false);
            }
        });
        gehBrenstofe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GehStofForm gehStofForm = new GehStofForm(Form.this);
                gehStofForm.setVisible(true);
                setVisible(false);

//                GehBrenstofe gehBrenstofe = new GehBrenstofe();
//                gehBrenstofe.setVisible(true);
//                setVisible(false);
            }
//            String heizVal = gehStofForm.getHeizVal();
//            GehBrenstofe gehBrenstofe = new GehBrenstofe();
//            gehBrenstofe.setHeizVal(heizVal);
//            gehBrenstofe.setVisible(true);
        });
    }
}



package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    public Form(){
        super("General form");
        super.setBounds(500,500,500, 470);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 10, 10));

        JButton gehStofe = new JButton("Gehandhabte stofe");
        //JButton update = new JButton("Update");
        JButton gehBrenstofe = new JButton("Gehandhabte Brennstofe");
        JButton gehTierhaltung = new JButton("Tierhaltung");
        JButton emission = new JButton("Emissionen");
        JButton close = new JButton("CLOSE");

        container.add(gehStofe);
//        container.add(update);
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
                GehStofe gehStofe = new GehStofe(Form.this);
                gehStofe.setVisible(true);
                setVisible(false);
            }
        });

        gehBrenstofe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GehStofe gehStofe = new GehStofe(Form.this);
                gehStofe.setVisible(true);
                setVisible(false);
            }
        });
    }
}



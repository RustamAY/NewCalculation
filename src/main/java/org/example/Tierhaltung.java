package org.example;

import javax.swing.*;
import java.awt.*;

public class Tierhaltung extends JFrame {

    public Tierhaltung(){

        super("Tierhaltung");
        super.setBounds(500,500,500,600);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(10,1,2,2));

        String[] items = {
                "00097051 - Legehennen",
                "00097064 - Legehennen (Elterntiere)",
                "00097052 - Junghennen",
                "00097053 - Masthähnchen",
                "00097054 - Truthennen/Truthähne",
                "00097063 - Enten"
        };

        JLabel stofNr = new JLabel("Stoff-Nr");
        JComboBox stoff = new JComboBox<>(items);
        JLabel anzahl = new JLabel("Anzahl Tiere");
        JTextField anzah = new JTextField("", 1);
        JLabel mittiere = new JLabel("Mittiere Masse/Tier (kg)");
        JTextField mitt = new JTextField("",1);
        JLabel gehVon = new JLabel("gehalten von (tt.mm)");
        JTextField gVon = new JTextField("",1);
        JLabel gehBis = new JLabel("gehalten bis (tt.mm)");
        JTextField gBis = new JTextField("",1);
        JLabel mass = new JLabel("Massenstrom");
        JLabel massValue = new JLabel(" Should be value of massenstrom");
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JCheckBox betribs = new JCheckBox("",false);
        JLabel grundFur = new JLabel("Grund für Geheimhaltung");
        JTextArea grung = new JTextArea();
        JButton back = new JButton("Back");
        JButton save = new JButton("Save");


        container.add(stofNr);
        container.add(stoff);
        container.add(anzahl);
        container.add(anzah);
        container.add(mittiere);
        container.add(mitt);
        container.add(gehVon);
        container.add(gehBis);
        container.add(gVon);
        container.add(gBis);
        container.add(mass);
        container.add(massValue);
        container.add(gesch);
        container.add(betribs);
        container.add(grundFur);
        container.add(grung);
        container.add(back);
        container.add(save);

    }

}


package org.example;

import javax.swing.*;
import java.awt.*;

public class Emissionen extends JFrame {

    public Emissionen(){

        super("Emissionen form");
        super.setBounds(500,500,600,450);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(13,2,2,10));

        Integer[] items = {01,02,03,04,05};
        String[] artValue = {
                "Normalbetrieb",
                "Anfahrbetrieb",
                "Abfahbetrieb",
                "Betriebsstorung",
                "Stillstan",
                "Reinigunsbetrieb"
        };

        String[] abgList = {
                "SCR - (z.B. DENOX)",
                "EGR - REA",
                "EGR - SCR",
                "EGR - REA - SCR"
        };

        JLabel qulle = new JLabel("Quelle-Nr");
        JComboBox qulleNr = new JComboBox(items);
        JLabel evNr = new JLabel("EV-Nr");
        JTextField ev = new JTextField("",1);
        JLabel bezeichnung = new JLabel("Bezeichnung");
        JTextField bezeich = new JTextField("", 1);
        JLabel art2 = new JLabel("Art");
        JComboBox art = new JComboBox(artValue);
        JLabel gesamdauer = new JLabel("Gesamdauer (h/a");
        JTextField gesamValue = new JTextField("",1);
        JLabel volumenstorm = new JLabel("Volumenstorm (Nn/h");
        JTextField volemenValue = new JTextField("", 1);
        JLabel feuche = new JLabel("Feuche (%)");
        JTextField feucheValue = new JTextField("", 1);
        JLabel abgas = new JLabel("Abgasrelningun");
        JComboBox abgasList = new JComboBox<>(abgList);
        JLabel erf = new JLabel("Erfassung/Berechnung");
        JLabel erf2 = new JLabel("has been recorded");
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JCheckBox betribs = new JCheckBox("",false);
        JLabel grundFur = new JLabel("Grund für Geheimhaltung");
        JTextArea grung = new JTextArea();
        JButton back = new JButton("Back");
        JButton save = new JButton("Save");

        container.add(qulle);
        container.add(qulleNr);
        container.add(evNr);
        container.add(ev);
        container.add(bezeichnung);
        container.add(bezeich);
        container.add(art2);
        container.add(art);
        container.add(gesamdauer);
        container.add(gesamValue);
        container.add(volumenstorm);
        container.add(volemenValue);
        container.add(feuche);
        container.add(feucheValue);
        container.add(abgas);
        container.add(abgasList);
        container.add(erf);
        container.add(erf2);
        container.add(gesch);
        container.add(betribs);
        container.add(grundFur);
        container.add(grung);
        container.add(back);
        container.add(save);


    }

}
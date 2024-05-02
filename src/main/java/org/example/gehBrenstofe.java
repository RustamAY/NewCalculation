package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gehBrenstofe extends JFrame {
    private String heizVal;

    public JLabel aggrValue, massValue;
    public JTextField dich,eins, heiz, schwefel, kohle;

    private JFrame form;

    public GehBrenstofe(String heizVal){
        this.heizVal = heizVal;
    }
    public GehBrenstofe(){

        super("Gehandhabte Brennstofe");
        super.setBounds(520, 520, 500,600);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(11, 2, 2, 2));

        String[] items = {
                "Heizöl EL",
                "Heizöl S",
                "Dieselkraftstoff",
                "Petroleum",
                "Crackbenzin aus Gasöl",
                "Erdgas"
        };

        String[] agg = {
                "g - gasformig",
                "l - flussig",
                "s - staubforming"
        };


        JLabel stofNr = new JLabel("Stof-Nr:");
        JComboBox stof = new JComboBox(items);
        JLabel aggr = new JLabel("Aggregatzustand");
        aggrValue = new JLabel("");

//      for (String item : items)
//            if (items[] = )
        JLabel dichte = new JLabel("Dichte (kg/m)");
        dich = new JTextField("", 1);
        JLabel einsa = new JLabel("Einsatzmenge (m/a)");
        eins = new JTextField("", 1);
        JLabel heizwert = new JLabel("Heizwert (kJ/kg)");
        heiz = new JTextField(heizVal, 1);
        JLabel schwef = new JLabel("Schwefelgehalt (%)");
        schwefel = new JTextField("0.001", 1);
        JLabel kohlen = new JLabel("Kohlenstoffgehalt (%)");
        kohle = new JTextField("75.0", 1);
        JLabel mass = new JLabel("Massenstrom");
        massValue = new JLabel(" Should be value of massenstrom");
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JCheckBox betribs = new JCheckBox("",false);
        JLabel grundFur = new JLabel("Grund für Geheimhaltung");
        JTextArea grung = new JTextArea();
        JButton back = new JButton("Back");
        JButton save = new JButton("Save");


        container.add(stofNr);
        container.add(stof);
        container.add(aggr);
        container.add(aggrValue);
        container.add(dichte);
        container.add(dich);
        container.add(einsa);
        container.add(eins);
        container.add(heizwert);
        container.add(heiz);
        container.add(schwef);
        container.add(schwefel);
        container.add(kohlen);
        container.add(kohle);
        container.add(mass);
        container.add(massValue);
        container.add(gesch);
        container.add(betribs);
        container.add(grundFur);
        container.add(grung);
        container.add(back);
        container.add(save);

        betribs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (betribs.isSelected()){
                    grung.setEnabled(true);
                }
                else {
                    grung.setEnabled(false);
                    grung.setText("");
                }
            }
        });

        stof.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object stofVal = stof.getSelectedItem();
                if(stofVal == "Erdgas") {
                    aggrValue.setText("g - gasformig");
                } else if (stofVal == "Petroleum"){
                    aggrValue.setText("l - flussig");
                } else {
                    aggrValue.setText("s - staubforming");
                }
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                form.setVisible(true);
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dichV = dich.getText();
                Integer diVal = Integer.parseInt(dichV);
                String einsVal = eins.getText();
                Integer eiVal = Integer.parseInt(einsVal);
                String heiz1 = heiz.getText();
                Integer heizVal = Integer.parseInt(heiz1);
                String schwe = schwefel.getText();
                Integer schwVal = Integer.parseInt(schwe);
                String kohl = kohle.getText();
                Integer kohlVal = Integer.parseInt(kohl);




            }
        });

    }
}

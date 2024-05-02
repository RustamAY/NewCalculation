package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gehStofe extends JFrame {
    private Form form;
    private String heizVal;
    JTextField bezValue, heiz, massen;
    JTextArea grung;
    JCheckBox betribs;
    JComboBox verComboBox;

    public gehStofe(Form form){
        this.form = form;

        setTitle("Gehandhabte Stofe");
        super.setBounds(520, 520, 500,450);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(7, 1, 2, 2));

        String[] items = {
                "00 - Einsatz = Endprodukt (Lagerstoff)",
                "01 - Einsatz",
                "02 - Zuschlag",
                "03 - Endprodukt",
                "04 - Nebenprodukt",
                "05 - Brennstoff"
        };

        JLabel bezeichnung = new JLabel("Bezeichnung:");
        bezValue = new JTextField("", 1);
        JLabel verwendung = new JLabel("Verwendung:");
        verComboBox = new JComboBox(items);
        JLabel heizwer = new JLabel("Heizwert Hu (kJ/kg):");
        heiz = new JTextField("",1);
        JLabel mass = new JLabel("Massenstorm");
        massen = new JTextField("",1);
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JLabel grundFur = new JLabel("Grund für Geheimhaltung");
        grung = new JTextArea();
        grung.setEnabled(false);
        betribs = new JCheckBox("",false);
        JButton back = new JButton("Back");
        JButton save = new JButton("Save");

        container.add(bezeichnung);
        container.add(bezValue);
        container.add(verwendung);
        container.add(verComboBox);
        container.add(heizwer);
        container.add(heiz);
        container.add(mass);
        container.add(massen);
        container.add(gesch);
        container.add(betribs);
        container.add(grundFur);
        container.add(grung);
        container.add(back);
        container.add(save);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                form.setVisible(true);
            }
        });

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

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bezText = bezValue.getText();
                heizVal = heiz.getText();
                Integer heizwertVal = Integer.parseInt(heizVal);
                String massVal = massen.getText();
                Integer masVal = Integer.parseInt(massVal);
                String grungText = grung.getText();
                Object vervendung = verComboBox.getSelectedItem();

                JOptionPane.showMessageDialog(null, "Bezeichnung: " + bezText + "\nVervendung: "
                        + vervendung + "\nHeizwert Hu(Kj/kg): " + heizwertVal + "\nMassenstrom: " + masVal +
                        "\nGrund fur Gehelmhaltung: " + "\n" + grungText);
            }
        });
    }

}

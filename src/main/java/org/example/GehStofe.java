package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GehStofe extends JFrame {

    public GehStofe(){}
//
//    public GehStofe(String bezeichnung, String verwendung, Double heizwert, Integer massenstrom, Boolean betribes, String grund){
//        this.bezName = bezeichnung;
//        this.vervendung = verwendung;
//        this.heizVal = String.valueOf(heizwert);
//        this.masVal = massenstrom;
//        this.betrib = betribes;
//        this.grungText = grund;
//
//    }

    public Form form;
    String heizVal, bezName, grungText, verv;
    Integer heizwertVal, masVal;
    JTextField bezValue;
    JTextField heiz;
    JTextField massen;
    JTextArea grung;
    JCheckBox betribs;
    JComboBox verComboBox;
    Object vervend;
    Boolean betrib;

    public GehStofe(Form form){
       this.form = form;

        setTitle("Gehandhabte Stofe");
        super.setBounds(520, 520, 500,450);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(8, 1, 2, 2));

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
        betrib = betribs.isSelected();
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

                bezName = bezValue.getText();
                heizVal = heiz.getText();
                heizwertVal = Integer.parseInt(heizVal);
                String massVal = massen.getText();
                masVal = Integer.parseInt(massVal);
                grungText = grung.getText();
                vervend = verComboBox.getSelectedItem();
                verv = vervend.toString();

                JOptionPane.showMessageDialog(null, "Bezeichnung: " + bezName + "\nVervendung: "
                        + vervend + "\nHeizwert Hu(Kj/kg): " + heizwertVal + "\nMassenstrom: " + masVal +
                        "\nGrund fur Gehelmhaltung: " + "\n" + grungText);

                GehStofe gehStofe = new GehStofe();

                gehStofe.setBezName(bezName);
                gehStofe.setVerv(verv);
                gehStofe.setHeizwertVal(heizwertVal);
                gehStofe.setMasVal(masVal);
                gehStofe.setBetrib(betrib);
                gehStofe.setGrungText(grungText);

                CRUD.saveGehStofe(gehStofe);

                System.out.println(gehStofe);
            }
        });

    }

    public String getBezName() {
        return bezName;
    }

    public void setBezName(String bezName) {
        this.bezName = bezName;
    }

    public String getGrungText() {
        return grungText;
    }

    public void setGrungText(String grungText) {
        this.grungText = grungText;
    }

    public Integer getHeizwertVal() {
        return heizwertVal;
    }

    public void setHeizwertVal(Integer heizwertVal) {
        this.heizwertVal = heizwertVal;
    }

    public Integer getMasVal() {
        return masVal;
    }

    public void setMasVal(Integer masVal) {
        this.masVal = masVal;
    }

    public String getVerv() {
        return verv;
    }

    public void setVerv(String verv) {
        this.verv = verv;
    }

    public Boolean getBetrib() {
        return betrib;
    }

    public void setBetrib(Boolean betrib) {
        this.betrib = betrib;
    }
}

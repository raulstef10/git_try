package com.company;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Numarul de instante: "));
        String last_message = "";
        for (int i = 0; i < n; i++) {
            Bottle Bottle = new Bottle();
            Bottle.setBrand(JOptionPane.showInputDialog(null, "Brand-ul apei:"));
            Bottle.setPrice(Float.parseFloat(JOptionPane.showInputDialog(null, "Pretul apei:")));
            Bottle.setVolume(Integer.parseInt(JOptionPane.showInputDialog(null, "Volumul apei:")));
            last_message = last_message + Bottle.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, last_message);


    }
}

package com.company;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Bottle Bottle = new Bottle();
        Bottle.setBrand(JOptionPane.showInputDialog(null, "Brand-ul apei:"));
        Bottle.setPrice(Float.parseFloat(JOptionPane.showInputDialog(null, "Pretul apei:")));
        Bottle.setVolume(Integer.parseInt(JOptionPane.showInputDialog(null, "Volumul apei:")));
        JOptionPane.showMessageDialog(null, Bottle.toString());


    }
}

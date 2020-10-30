package com.company;

import javax.swing.*;

public class TemaMedie {

    public static void main(String[] args) {
        int n = Integer.valueOf(JOptionPane.showInputDialog(null, "Numărul de numere este :"));
        int s = 0;
        for (int i = 0; i < n; i++)
            s = s + Integer.valueOf(JOptionPane.showInputDialog(null, "Numărul " + (1 + i) + " este :"));
        JOptionPane.showMessageDialog(null, "Media este: " + String.format("%.2f", (s * 1.0) / n));

    }
}

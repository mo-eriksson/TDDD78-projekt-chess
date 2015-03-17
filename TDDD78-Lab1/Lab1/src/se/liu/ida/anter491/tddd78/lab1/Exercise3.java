package se.liu.ida.anter491.tddd78.lab1;

import javax.swing.*;

public class Exercise3
{
    // private final static int tabell = 8;

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please input a value");
        int tabell = Integer.parseInt(input);
        multiply(tabell);
    }
    public static void multiply(int tabell) {
        int i = 0;

        while (i <= 10) {
            System.out.println(i + " * " + tabell + " = " + i * tabell);
            i++;
        }
    }
}

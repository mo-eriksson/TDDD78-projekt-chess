package se.liu.ida.anter491.tddd78.lab1;

import javax.swing.*;

public class Exercise2
{
    public static int sumFor(int a, int b) {
	int sum = 0;
	for (int i = a; i <= b; i++) {
	    sum += i;

	}
	 return sum;

    }
    public static void main(String[] args) {

	String inputA = JOptionPane.showInputDialog("Please input a value for A");
	int a = 0;
	try {
	    a = Integer.parseInt(inputA);
	} catch(NumberFormatException e) {
	    e.printStackTrace();
	    System.out.println("Non-numeric input for A");
	}


	String inputB = JOptionPane.showInputDialog("Please input a value for B");
	int b = 0;
	try {
	    b = Integer.parseInt(inputB);
	} catch(NumberFormatException e) {
	    e.printStackTrace();
	    System.out.println("Non-numeric input for B");
	}

	String inputMethod = JOptionPane.showInputDialog("Please select the method you would like to use");
	switch (inputMethod) {
	    case "for":
		System.out.println(sumFor(a, b));
		break;
	    case "while":
		System.out.println(sumWhile(a, b));
		break;
	    case "do":
		System.out.println(sumDoWhile(a, b));
		break;
	    default:
		System.out.println("Invalid input");
	}
    }
    public static int sumWhile(int a, int b) {
	int i = a;
	int sum = 0;
	while (i <= b) {
	    sum += i;
	    i++;

	}
	return sum;
    }

    public static int sumDoWhile(int a, int b) {
	int i = a;
	int sum = 0;
	do {
	    sum += i;
	    i++;

	} while (i <= b);

	return sum;

    }

}

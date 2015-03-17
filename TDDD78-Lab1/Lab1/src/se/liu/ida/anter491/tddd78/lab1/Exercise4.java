package se.liu.ida.anter491.tddd78.lab1;

// II

public class Exercise4
{
    public static void main(String[] args) {
	int input = 0;
	factorial(input);
    }

    public static void factorial(int input) {
    int fac = input;
    if (fac == 0) {
	System.out.println(0 + "-fakultet: " + fac);
	input = 1;
	factorial(input);
    }
    else {
	for (int i = 1; i <= 10; i++) {
	    fac *= i;
	    System.out.println(i + "-fakultet: " + fac);
	}
    }
    }
}

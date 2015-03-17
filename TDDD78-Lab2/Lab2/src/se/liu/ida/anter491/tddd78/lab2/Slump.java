package se.liu.ida.anter491.tddd78.lab2;

import java.util.Random;

public class Slump
{
    public static void main(String[] args) {
	for (int i = 1; i <=25 ; i++) {
	    Random rnd = new Random();
	    System.out.println("No." + i + " " +rnd.nextInt(100));
	}
    }
}

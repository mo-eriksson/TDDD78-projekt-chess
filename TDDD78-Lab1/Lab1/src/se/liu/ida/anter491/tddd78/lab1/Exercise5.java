package se.liu.ida.anter491.tddd78.lab1;

public class Exercise5
{
    public static void main(String[] args) {
	for (int i = 2; i <= 100 ; i++) {
	    if (isPrime(i)) {
		System.out.println(i);
	    }

	}

    }

    public static boolean isPrime(int number) {
	for (int i = 2; i < number; i++) {

	    int remainder = number % i;
	    if (remainder == 0) {
		return false;
	    }
	}
	return true;
    }
}
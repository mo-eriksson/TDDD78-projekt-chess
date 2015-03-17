package se.liu.ida.anter491.tddd78.lab2;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

// import static sun.text.normalizer.UCharacter.getAge;
// import java.time.Period;

public class Person
{
    private String name;
    private LocalDate birthDay;

    public Person(String name, LocalDate birthDay) {
	this.name = name;
	this.birthDay = birthDay;
	// System.out.println(name + birthDay);
    }
    public int getAge() {
	Period ageP = Period.between(birthDay, LocalDate.now());
	int ageInt = ageP.getYears();
	return ageInt;

    }

    @Override
    public String toString() {
	return  "Name: " + name + ", Age: " + getAge();

    }

    public static void main(String[] args) {
	String testName = "Anton Mo Eriksson";
	LocalDate testDate = LocalDate.of(1995, 3, 8);

	Person testAnton = new Person(testName, testDate);
	Person testJulia = new Person("Julia", LocalDate.of(1995, 8, 25));
	Person testJohan = new Person("jOHAN", LocalDate.of(1999,5,10));
	// System.out.println(testAnton.getAge());
	System.out.println(testAnton.toString());
	System.out.println(testJulia.toString());
	System.out.println(testJohan.toString());
	// System.out.println(testAnton.name + " " + testAnton.birthDay);


    }

}



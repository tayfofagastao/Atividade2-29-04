package candicional;

import java.util.Scanner;

public class Atividade2904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int totalAges = 0;
	        int numberOfAges = 0;
	        int age;

	        System.out.println("Enter ages (enter 0 to quit):");
	        age = scanner.nextInt();

	        while (age != 0) {
	            totalAges += age;
	            numberOfAges++;
	            age = scanner.nextInt();
	        }

	        if (numberOfAges > 0) {
	            double averageAge = (double) totalAges / numberOfAges;
	            System.out.printf("The average age is %.2f%n", averageAge);
	        } else {
	            System.out.println("No ages were entered.");
	        }

	        scanner.close();
	    }
	

	}



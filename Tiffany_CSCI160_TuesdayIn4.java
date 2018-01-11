/*
Tiffany Shiu
CSCI160
Tuesday at 6:30
Loops
*/

import java.util.*;

public class Tiffany_CSCI160_TuesdayIn4 {
	public static void main(String[] args) {
		System.out.println("Part A");
		System.out.println("Part 1");
		int number1 = 10;
		System.out.println(number1);
		while (number1 <50)
		{
				number1 = number1 + 1;
				System.out.println(number1);
		}

		System.out.println("Part 2");
		int number2 = 20;
      
		System.out.print(number2 + " ");
		while (number2 >0)
		{
			number2 = number2 -1;
			System.out.print (number2 + " ");
		}

		System.out.println("");
		System.out.println("Part 3");
		double number3 = 0;
		System.out.println( number3);
		while (number3 <10)
		{
			number3 = number3 + .5;
			System.out.println(number3);
		}

		//part B
		System.out.println("Part B");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int number4 = 0;
		number4 = sc.nextInt ();
		double pSum = 0;
		int pCount = 0;
		double nSum = 0;
		int nCount = 0;
		while (number4 != 0)
		{
			if (number4 >0) {
				pSum = pSum + number4;
				pCount = pCount +1;
			}
			if (number4 <0) {
				nSum = number4 + nSum;
				nCount = nCount + 1;
			}
			System.out.println("Enter a value");
			number4 = sc.nextInt();
		}
		double pAvg = 0;
		double nAvg = 0;
		pAvg = pSum/pCount;
		nAvg = nSum/nCount;

		if (pCount == 0) {
			System.out.println("There were no positive values entered.");
			}
		else {
			System.out.printf("The average of the positive integers entered %.2f",pAvg);
			System.out.println ("");
			}
		if (nCount == 0) {
			System.out.println ("There were  no negative values entered.");
		}
		else {
			System.out.printf("The average of the negative intergers enger %.2f,", nAvg);
			System.out.println ("");
		}
		
		//Part C
		System.out.println ("Enter a value for the length of a line");
		int line = 0;
		line = sc.nextInt();
		int i = 0;
		while (i < line)
		{
			System.out.print("*");
			i = i + 1;
		}
		
		
		
		
		}


	}



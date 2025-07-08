
  package com.imp;
import java.util.*;
/* This Question Asked in the Written Test at CloudOdsessy Company [Manyata Tech Park ] 
 * Write a Java program to check whether a given number is a Strong Number or not.
(A Strong Number is a number whose sum of the factorials 
of its digits is equal to the number itself. Example: 145 → 1! + 4! + 5! = 145)
 */
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		DigitsSumFactorial(n);
	}
	static void DigitsSumFactorial(int n)
	{
		int original=n;
		int sum=0;
		while(n!=0)
		{
			int fact=1;
			int rem = n%10;
			for(int i=1;i<=rem;i++)
			{
				fact = fact * i;
			}
			sum = sum+fact;
			n = n/10;
		}
		if(sum==original)
		{
			System.out.println("sum of numbers of factorial is equal to the N value");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}

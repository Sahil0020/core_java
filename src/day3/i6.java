package day3;

import java.util.Scanner;

public class i6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int rem=num%10;
	if(rem%3==0)
	{
		System.out.println("Number :"+num+" last digit: "+rem+" is divisible by 3");
	}
	else {
		System.out.println("Number :"+num+" last digit: "+rem+" is not divisible by 3");

	}
}
}

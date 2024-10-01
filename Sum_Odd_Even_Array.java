package day2_21_09_2024;

import java.util.Scanner;

public class Sum_Odd_Even_Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]; 
		int i,odd=0,even=0;
		a=new int[5];
		System.out.println("Enter 5 value for array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			even=even+a[i];
			else
				odd=odd+a[i];
		}
		System.out.println("Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]=" +a[i]);
		}
		
System.out.println("Odd Sum ="+odd);
System.out.println("Even Sum ="+even);

	}

}

package day2_21_09_2024;

import java.util.Scanner;

public class Scan_Print_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]; 
		int i;
		a=new int[5];
		System.out.println("Enter 5 value for array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]=" +a[i]);
		}

	}

}

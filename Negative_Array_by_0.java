/*Write a program scan array which is a combination
of positive and negative numbers
replace all negative number by 0
and print total replacement
(use single array)
*/
package day2_21_09_2024;

import java.util.Scanner;

public class Negative_Array_by_0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[],b[]; 
		int i;
		a=new int[5];
		b=new int[5];
		System.out.println("Enter value for A array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		//process for loop
		int j=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=0;
				j++;
			}
		}
		
		System.out.println("B Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("b["+i+"]=" +a[i]);
		}
		
		System.out.println("Total Replacement" +j);

	}

}

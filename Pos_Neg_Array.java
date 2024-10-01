/*Write a program scan  a array which is combination
of positive and negative numbers.
Stored only positive numbers into b array
and print how many positive numbers stored into b 
array
*/
package day2_21_09_2024;

import java.util.Scanner;

public class Pos_Neg_Array {

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
			if(a[i]>0)
			{
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("B Array Elements");
		for(i=0;i<j;i++)
		{
			System.out.println("b["+i+"]=" +b[i]);
		}
		System.out.println("Total Number Copy" +j);

	}

}

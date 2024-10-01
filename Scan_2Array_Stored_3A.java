/*Write a program scan two array
and stored alternate elements into third array
*/
package day2_21_09_2024;

import java.util.Scanner;

public class Scan_2Array_Stored_3A {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[],b[],c[]; 
		int i;
		a=new int[5];
		b=new int[5];
		c=new int[10];
		System.out.println("Enter value for A array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter value for B array");
		for(i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
			
		}
		//process for loop
		int j=0;
		for(i=0;i<c.length;i=i+2)
		{
			c[i]=a[j];
			j++;
		}
		j=0;
		for(i=1;i<c.length;i=i+2)
		{
			c[i]=b[j];
		}
		
		System.out.println("C Array Elements");
		for(i=0;i<c.length;i++)
		{
			System.out.println("c["+i+"]=" +c[i]);
		}
	}

}

/*Write a program scan array
calculate the sum of digit of each position 
and stored into b array
print both array
*/
package day2_21_09_2024;

import java.util.Scanner;

public class Sum_Digits_Array {

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
		int n,sum=0,j=0;
		for(i=0;i<a.length;i++)
		{
			n=a[i];
			sum=0;
			while(n>0)
			{
				sum=sum+n%10;
				n=n/10;
			}
			b[j]=sum;
			j++;
			
		}
		
		System.out.println("A Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]=" +a[i]);
		}
		
		System.out.println("B Array Elements");
		for(i=0;i<a.length;i++)
		{
		System.out.println("b["+i+"]=" +b[i]);
		}
	


	}

}

package day2_21_09_2024;
import java.util.Scanner;
public class StringOperations {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			String s1="Have A NICE DAY";
			String s2=" Everyone";
			System.out.println("Length="+s1.length());
			System.out.println("Chat At 5th= "+s1.charAt(5));
			System.out.println("Upper String"+s1.toUpperCase());
			System.out.println("Lower String="+s1.toLowerCase());
			System.out.println("Join String = "+s1.concat(s2));
			//System.out.println("Copy String = "+String.copyValueOf(null)::s1,s2);
		}	
}



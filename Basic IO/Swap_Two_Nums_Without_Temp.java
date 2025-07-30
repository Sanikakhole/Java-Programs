/* program that accept two numbers from the user and swap their values. ( Without using Temp Variable) */

import java.util.*;
import java.lang.*;

public class Swap_Two_Nums_Without_Temp
{
	public static void main(String[] args)
	{
		int NO1 = 0, NO2 = 0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("/n Enter 1st number : ");
		NO1 = sc.nextInt();
		
		System.out.print("/n Enter 2nd number :");
		NO2 = sc.nextInt();
		
		System.out.println("/n Before Swapping :");
		System.out.println("/t 1st Number = " + NO1);
		System.out.println("/t 2nd Number = " + NO2);		
		
		// Logic for Swapping
		
		NO1 = NO1 + NO2;
		NO2 = NO1 - NO2;
		NO1 = NO1 - NO2;
		
		System.out.println("/n After Swapping :");
		System.out.println("/n 1st Number :" + NO1);
		System.out.println("/n 2st Number :" + NO2);
		
	}
}
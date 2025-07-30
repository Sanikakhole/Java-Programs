/* Program which accept temprature in Fahrenheit & convert itinto celsius.*/

import java.util.*;
import java.lang.*;

public class Fahrenheit_To_Celcius
{
	public static void main(String[] args)
	{
		float Fht = 0.0f, cel = 0.0f;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print(" Enter Temprature(in Fahrenheit) : ");
		Fht =sc.nextFloat();
		
		cel = (Fht-32)*(5f/9f);
		
		System.out.println("Temprature => " + Fht + "Fahrenheit" +"=> " + cel + "Celcius");
	}
}
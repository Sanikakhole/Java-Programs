/* Program Which accept distance in Kilometer & convert it into meter*/

import java.lang.*;
import java.util.*;

public class KM_To_Meter
{
	public static void main(String[] args)
	{
		float Km = 0.0f,Mtr= 0.0f;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("/n Enter Distance of Kilometer :");
		Km = sc.nextFloat();
		
		Mtr = Km*1000;
		
		System.out.println("/n Distance =>" + Km +"Kms. =" + Mtr + "Meters.");
	}
}

		
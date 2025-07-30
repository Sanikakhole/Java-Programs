/* Program which accept Width & Height of Rectangle From user and calculate its Area */

import java.util.*;
import java.lang.*;

public class Rect_Area
{
	public static void main(String[] args)
	{
		float Ht = 0.0f, Wd = 0.0f, Area = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("/n Enter the Height of Rectangle :");
		Ht = sc.nextFloat();
		
		System.out.print("/n Enter the Width of Rectangle :");
		Wd = sc.nextFloat();
		
		Area = Ht*Wd;
		System.out.print("/n Area of the Rectangle :" + Area +".");
		}
}
		
/*Program Which accept radius of circle from user & calculate area of circle   */

import  java.lang.* ;
import java.util.* ;

public class Circle_Area
{
	public static void main(String[] args)
	{
		float Rad = 0.0f, Area = 0.0f;
		final float PI = 3.14f;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n Enter Radius of circle :");
		Rad = s.nextFloat();
		
		Area = PI*Rad*Rad;
		
		System.out.print("\n Area Of Circle :" +Area + ".");
	}
}
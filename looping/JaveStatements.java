/**
 * Copyright © 2018 Lhasa Limited
 * File created: 15 Apr 2019 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $Id$
 */
package looping;

import java.time.DayOfWeek;

/**
 * @author Mark Nolan
 * @since 15 Apr 2019
 */
public class JaveStatements
{
	public static void main(String[] args)
	{
		UnreachableStatement();
		TernaryOperator();
		SwitchNoBreaks();
		WhileandDoWhile(15,15);
		forLoop();
	}

	private static void UnreachableStatement()
	{
		int hourOfDay = 10;
		if (hourOfDay == 15) //be careful of = instead of ==
		{
			System.out.println("good afternon");
		}
		else if (hourOfDay < 11)
		{
			System.out.println("good morining"); //unreachavle code
		}
		else
		{
			System.out.println("good evebubg");
		}
	}

	private static void TernaryOperator()
	{
//booleanExpression ? expression 1 : expression 2
		int y = 10;
		final int x;
		if (y > 5) //booleanExpression

		{
			x = 2 * y; //expression 1
		}
		else
		{
			x = 3 * y; //expression 2
		}
		System.out.println(x);
		//above as ternary operator:
		int x1 = (y > 5) ? (2 * y) : (3 * y);
		System.out.println(x1);

		System.out.println((y > 5 ? 21 : "Zebra")); //y is true so prints out 21 - compiles as sout can convert ints etc to string
//		int animal = (y>5?21:"Zebra"); wont compile as zebra is a string, but animal is assigned int
//		System.out.println(animal);
	}

	private static void SwitchNoBreaks()
	{
		int dayofWeek = 5; //code would jump to default and then execute until it reaches a break.
		switch (dayofWeek)
		{
			case 0:
				System.out.println("Sunday");
			default:
				System.out.println("Weekday");
			case 6:
				System.out.println("Saturday");
				break;
		}

	}
//
//	private int getSortOder(String firstname, final String lastname)
//	{
//		String middleName = "Patricia";
//		final String suffix = "JR";
//		int id = 0;
//		switch (firstname)
//		{
//			case "test":
//				return 52; //use return to exit switch statment
//			case middleName: //not final variable
//				id = 5;
//				break;
//			case suffix: //is a final variable
//				id = 0;
//				break;
//			case lastName: //not a constant as passed in via method
//				id = 8;
//				break;
//			case 5: //not a string
//				id = 7;
//				break;
//			case 'J': //not a string
//				id = 10;
//				break;
//			case DayOfWeek.SUNDAY //not a string (enum)
//				id = 15;
//				break;
//		}
//		return id;
//	}


	private static int  WhileandDoWhile(int x, int x1)
	{
		{
			while (x > 10)
			{
				x--; //this may not be executed if while is false
				System.out.println("While value is: " + x);
			}

			do
			{
				x1--; //this is executed at least once
				System.out.println("Do While value is: " + x1);
			}
			while (x1 > 10);
//these are both equivalent,

		}
		return x;

	}

	private static void forLoop()
	{

		for(int i = 0; i<10; i++){
			System.out.println(i + "");
		}
		//for(initialization
		// ;booleanExpression;updateStatement)
}


}


/* ---------------------------------------------------------------------*
 * This software is the confidential and proprietary
 * information of Lhasa Limited
 * Granary Wharf House, 2 Canal Wharf, Leeds, LS11 5PS
 * ---
 * No part of this confidential information shall be disclosed
 * and it shall be used only in accordance with the terms of a
 * written license agreement entered into by holder of the information
 * with LHASA Ltd.
 * --------------------------------------------------------------------- */
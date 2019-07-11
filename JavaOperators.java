/**
 * Copyright © 2018 Lhasa Limited
 * File created: 11 Apr 2019 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $Id$
 */

import java.io.File;

/**
 * @author Mark Nolan
 * @since 11 Apr 2019
 */
public class JavaOperators
{
	//	Byte,short,char,int,long,float,double, (smallest to largest)
	public static void main(String[] args)
	{
		operatorOrder();
		NumericPromotion();
		UnaryOperators();
		IncrementandDecrement();
		Casting();
		CompoundAssignment();
		RelationalOperators();
		LogicalOperators();
		EqualityOperators();
	}

	private static void operatorOrder()
	{
		int y = 4;
		// --y is done first, then multiple then add
		double x = 3 + 2 * --y;
		System.out.println(y);
		//*left to right then -
		int hehe = 2 * 5 + 3 * 4 - 8;
		System.out.println(hehe);
		//brackets are done first
		int hoho = 2 * ((5 + 3) * 4 - 8);
		System.out.println(hoho);
		// /- gives nearest value of division, % gives remainder;
		System.out.println(10 / 3); //outputs 3
		System.out.println(10 % 3); //outputs 1
	}

	private static void NumericPromotion()
	{
		// integral is whole, floating point is decimal

		int x = 1;
		long y = 3;
		//below will error out as java will promote int to larger datatype
		//int z = x * y;

		short a = 10;
		short b = 13;

//		short c = a/b; wont work as smaller data types (byte, short, car) are promoted to int
		int c = a / b;

		short a1 = 14;
		float b1 = 13;
		double c1 = 20;
//What would you expect the type for the the output

//		int d = a1 * b1 / c1;
//		short d = a1 * b1 / c1;
//		float d = a1 * b1 / c1;
		double d = a1 * b1 / c1;


		System.out.println(d);
	}

	private static void UnaryOperators()
	{
		System.out.println(!true);
		int x = 34;
		System.out.println(-x);
	}

	private static void IncrementandDecrement()
	{
		int a = 1;
		System.out.println(a++);
		//++ is applied after the code is run
		System.out.println(a);
		System.out.println(++a);
		//++ is applied before returning the value
		System.out.println(a);

	}

	private static void Casting()
	{
		short x = 10;
		short y = 3;
//either change to int due to values smaller than int converted to int or cast it (basically ignore default behaviour)
		int z1 = x * y;
		short z = (short) (x * y);
		System.out.println(z);
	}

	private static void CompoundAssignment()
	{
		long x = 10;
		int y = 5;
//y = (int) (y * x); in this case, has to cast x to long, apply * to two long values, then cast it, by using the below function it does all this.
		y *= x;
		System.out.println(y);

		long a = 5;
		long y1 = (a = 3);
		System.out.println(x);//3
		System.out.println(y1); //3
		//an assignmet is an expression in of itself (so = is an expression) sets value of x to b 3 and also returns it.

	}

	private static void RelationalOperators()
	{
		int x = 10, y = 20, z = 10;
		System.out.println(x > z);//false as x is not strityly greater than z
		System.out.println(x >= z);//true as x is equal to z

	}

	private static void LogicalOperators()
	{
		//evaluating - & for true. |(or) for false ^ - for true if both are different
		// z = x & y - will only true if x,and y are both true
		// z = x | y only return false if both are false
		//&& || are short circuits - only
		int y = 2;
		boolean x = true||(y<4);
		System.out.println(x); //as b4 || is true, it can only ever be true so no need to evaluate the next statment (remember | does both(

	}

	private static void EqualityOperators()
	{
//num, bool and objects only - cant mix and match

		System.out.println(5==5.00); //returns true as int promoted to double
		File x = new File("myFile.txt");
		File y = new File("myFile.txt");
		File z = x;
		System.out.println(x==y); //false
		System.out.println(x==z); //true
		//this is because equality is applited to the references of the object, not the objects they point two (i.e x and y are two different objects)
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
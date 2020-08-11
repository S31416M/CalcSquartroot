package com.Subu;

import java.io.*;
import java.util.Scanner;

public class calcSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySqrt getSqrt1 = new mySqrt(0.00001);
		Scanner readme = new Scanner(System.in);
		System.out.print("Enter a number:");
		getSqrt1.input = readme.nextDouble();
		
		System.out.println("The sqrt value is " + getSqrt1.getSqrt());

	}

}

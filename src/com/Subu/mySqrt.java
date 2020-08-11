package com.Subu;
import java.io.*;

public class mySqrt {
	public double input;
	private double accuracy;
	mySqrt(double in1){
		accuracy = in1;
	}
	public double getSqrt() {
		double xn, xnPlus1=0.0;
		xn=input/2;
		do {
			xnPlus1 = (xn + input/xn)/2;
			System.out.println("output: " + xnPlus1);
			if((xn-xnPlus1) < accuracy) break;
			else xn = xnPlus1;
		} while(xn == xnPlus1);
		
		return(xn);
	}
}

package com.demo.test;

import java.awt.Color;

public class Main {
	
	public static void main(String[] args) {
		
		Car myCar = new Car(50, "A123A", Color.BLACK, true);
		
		Car tomsCar = new Car(15, "B546D", Color.WHITE, true);
		
		//System.out.println("My can plate nr is : " + myCar.getLicensePlate());
		
		myCar.changePaintColor(Color.BLUE);
		
		//System.out.println(myCar.getPaintColor().toString());
		
		String emptyString = "E";
		String nullString = null;
		
		System.out.println(null != emptyString && !emptyString.isEmpty());
	
	}

}

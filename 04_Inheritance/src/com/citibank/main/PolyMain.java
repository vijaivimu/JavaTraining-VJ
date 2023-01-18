package com.citibank.main;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shape;
import com.citibank.main.domain.Triangle;

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}


	public static Shape getShape(int choice)
	{
		if(choice ==1)
		{
			Shape shape = new Circle();
			return shape;
		}
		if(choice ==2)
		{
			Shape shape = new Triangle();
			return shape;
		}	
		if(choice ==1)
		{
			Shape shape = new Line();
			return shape;
		}	
		return new Shape();
	}
}



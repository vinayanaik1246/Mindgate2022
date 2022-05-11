package com.paint.main;

import java.util.Scanner;

import com.paint.factory.ShapesFactory;
import com.paint.pojo.Shapes;

public class ShapesMain{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Shapes:: \n 1.Circle \n 2.Triangle \n 3.Square ");
		System.out.println("Enter choice:");
		
		int choice=scanner.nextInt();
		
		Shapes shapes=ShapesFactory.getShapes(choice);
		if(shapes != null)
		shapes.draw();
		else
			System.out.println("invalid choice");
		
	}

}

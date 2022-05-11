package com.paint.factory;

import com.paint.pojo.Circle;
import com.paint.pojo.Shapes;
import com.paint.pojo.Sqaure;
import com.paint.pojo.Triangle;

public class ShapesFactory {

	public static Shapes getShapes(int choice) {
		Shapes shape = null;
		switch (choice) {

		case 1:
			shape = new Circle();
			break;

		case 2:
			shape = new Triangle();
			break;

		case 3:
			shape = new Sqaure();
			break;
			
	//	default:
//			shapes=new Shapes();
//			break;

		}
		return shape;
	}

}

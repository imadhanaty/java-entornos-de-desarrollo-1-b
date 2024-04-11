package app;

import modelos.rectangulo;

public class Main {

	public static void main(String[] args) {
		rectangulo r1=new rectangulo();
		rectangulo r2=new rectangulo(3,2);
		
		double area_r1=r1.area();
		double perimetro_r2=r2.perimetro();
		
		System.out.println(area_r1);
		System.out.println(perimetro_r2);

	}

}

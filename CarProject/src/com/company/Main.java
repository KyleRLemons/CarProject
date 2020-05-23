package com.company;

public class Main {

    public static void main(String[] args) {


		Automobile car1 = new Automobile();

		Automobile car2 = new Automobile();


		car1.setDescription("Ford GT400");
		car1.setOdometer(2600);
		car1.setSpeed(79);
		car1.setGear('3');
		car1.display();



		car2.setDescription("Toyota Prius");
		car2.setOdometer(147928);
		car2.setSpeed(62);
		car2.setGear('D');
		car2.display();


	}
}

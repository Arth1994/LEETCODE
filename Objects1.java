import java.util.*;
import java.io.*;


//Base Object Car
class Car
{
	int speed=0;
	int gear_number=0;
	int number_of_gears=1;

	void changeSpeed(int newSpeed)
	{
	
		speed=newSpeed;
	
	}

	void changeGear(int newGear)
	{
	
		number_of_gears=newGear;
	
	}

	void switchGear(int switchGears)
	{
		
		number_of_gears=switchGears;
	
	}


	void printCar()
	{
	
		System.out.println("Speed is "+speed+" Gear is  "+number_of_gears+" Current Gear is "+number_of_gears);		
	
	}

}



//Showing Demo Example for the base Object Car
class Objects1
{

	public static void main(String []args)

	{
	
	Car c1=new Car();
	Car c2=new Car();

	c1.changeSpeed(25);
	c1.changeGear(35);
	c1.switchGear(4);
	c1.printCar();

	c2.changeSpeed(55);
	c2.changeGear(35);
	c2.switchGear(5);
	c2.printCar();

	}



}

import java.util.*;
import java.io.*;


interface Bicycle
{
	public void changeGear(int newValue);
}




class ACMBicycle implements Bicycle
{
	int gear=1;
	
	public void changeGear(int newValue)
	{
		gear=gear+newValue;
	}

	void Print()
	{
		System.out.println("The Current Gear Value "+gear);
	}
	
}



class tutorial
{
	public static void main(String []args)
	{

		ACMBicycle c1=new ACMBicycle();
		c1.changeGear(4);
		c1.Print();
	}

}

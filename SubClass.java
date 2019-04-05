import java.util.*;
import java.io.*;

class SuperClass
{
	public void myPrint()
	{
	
		System.out.println("This is a SuperClass");
	
	}
}

public class SubClass extends SuperClass{

	public void myPrint()
	{
	
		super.myPrint();
		System.out.println("This is a SubClass");
	
	}

	public static void main(String args[])
	{
	
		SubClass c1=new SubClass();
		c1.myPrint();
	
	}

}

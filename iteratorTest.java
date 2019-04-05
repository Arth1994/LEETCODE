import java.util.*;

/**
	Just a Skeleton Snippet for understanding iterator.
*/

public class iteratorTest{
	public static void main(String args[])
	{
		Integer ints = {1,2,3};
		MyIterable<Integer> MyIterable = new MyIterable(ints);
		for(Integer i : MyIterable)
		{
			System.Out.println(i);
		}
	}
}

public class MyIterable<T> implements Iterable<T>{
	List<T> list; 

	public MyIterable(T [] t){
		list = Arrays.asList(t);
		Collections.reverse();
	}

	@Override
	public Iterator<T> iterator(){
		return list.iterator();
	}
}


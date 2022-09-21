package programs;
import java.util.*;
public class ColorRetrieve 
{
	public static void main(String[]args)
	{
		List<String> l =new ArrayList<String>();
		l.add("pink");
		l.add("white");
		l.add("black");
		l.add("blue");
		l.add("red");
		Iterator<String>it =l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		
	}

}
}

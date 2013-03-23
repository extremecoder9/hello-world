import java.util.*;
class Main1
{
	public static void main(String args[])
	{
	Vector v=new Vector(2,2);
	v.add(25);
	v.add(45);
	v.add(78);
	v.add(10);
	Collection c=v;
	System.out.println(c);
	for(/*Object*/ i:c)
		System.out.println(i);
	}
}


	//import java.util.*;
	class Main
	{
	public static void main(String args[])
	{
	/*Array*/List a=new ArrayList();
	/*s*/ystem.out.println("Size of the Array:"+a.size());
	Integer in=new Integer(90);
	Integer n=new Integer(30);
	a.add(in);
	a.add(n);
	/*s*/ystem.out.println("Sum:"+(in+n));
	Iterator it=a./*I*/terator();
	while(it.hasNext())
	/*s*/ystem.out.println(it.next());
	/*s*/ystem.out.println("Size of the Array:"+a.size());
	}
	}


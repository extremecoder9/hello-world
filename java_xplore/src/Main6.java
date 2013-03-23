import java.util.*;
class Main6
{
public static void main(String args[])
{
TreeSet t=new TreeSet();
String in=null;
t.add("xyz");
t.add("abc");
t.add("lmn");
t.add("iouf");
t.add("hjjhdf");
t.add("abc");
//t.add(909889);//ClassCastException
//t.add(in);//NullPointerException
Iterator i=t.iterator();
while(i.hasNext())
System.out.println(i.next());
//Add a code snippet here, so that you get the following output

/*System.out.println(t.clone());*/
}
}

/*abc
hjjhdf
iouf
lmn
xyz
[abc, hjjhdf, iouf, lmn, xyz]*/
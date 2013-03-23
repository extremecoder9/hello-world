import java.util.*;
class Main7
{
public static void main(String args[])
{
HashMap<String,String> h=new HashMap<String,String>();

h.put("10","abc");
h.put("2","bcd");
h.put("7","def");
//h.put("8",123);

h.put("2","bcde");

System.out.println(h.get("10"));
System.out.println("the objects inside the hash map object");
Set s=h.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
system.out.println(i.next());
System.out.println("the keys inside the hash map object");
/*s*/et s1=h.keySet();
Iterator i1=s1.iterator();

while(i1.hasNext())
{
System.out.println(i1.next());
}
}
}
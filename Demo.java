import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo{
public static void main(String[] args){
List<Integer> l=new ArrayList<Integer>();
l.add(10);
l.add(11);
l.add(12);
l.add(13);
l.add(14);
l.add(15);
l.add(16);
l.add(17);
l.add(18);
l.add(19);
Iterator<Integer> i=l.iterator();
List<Integer>oddlist=new ArrayList<Integer>();
List<Integer>evenlist=new ArrayList<Integer>();
while(i.hasNext()){
int element=i.next();
if(element%2==0) evenlist.add(element);
else oddlist.add(element);
}
System.out.println(l);
System.out.println(oddlist);
System.out.println(evenlist);
}
}
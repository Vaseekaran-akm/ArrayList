import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DemoList1{
public static void main(String[] args){
List<Integer>l1=new ArrayList<Integer>();
l1.add(10);
l1.add(20);
l1.add(30);
l1.add(40);
List<Integer>l2=new ArrayList<Integer>();
l2.add(50);
l2.add(60);
l2.add(70);
l1.addAll(l2);
System.out.println("l1- "+l1);
System.out.println("l2- "+l2);
l1.removeAll(l2);
System.out.println(l1.indexOf(30));
System.out.println(l1.lastIndexOf(30));
ListIterator<Integer>li=l1.listIterator(l1.size());
while(li.hasPrevious())
System.out.println(li.previous()+" ");
}
}
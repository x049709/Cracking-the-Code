package Q2_07_JavaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class QuestionE {
	/**
	 * Walk through the Java linklist forwards and backwards
	 * @param n
	 * @return
	 */
	public  static void javaLinkList() {
		
		LinkedList<String> ll=new LinkedList<>();  
        ll.add("Ed");  
        ll.add("Carlos");  
        ll.add("Joe");  

        //Traversing the list of elements in forward order  
        System.out.println("forward:");
        Iterator<String> i=ll.listIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }
        
        //Traversing the list of elements in reverse order  
        System.out.println("backward:");
        i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
	}

	public static void main(String[] args) {
		javaLinkList();
	}

}

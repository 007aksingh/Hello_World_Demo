package JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	  public static void main(String[] args) {
	   
	   List<String> ls= new ArrayList();
	   ls.add("A");
	   ls.add("B");
	   ls.add("C");
	   ls.add("D");
	   System.out.println(ls);
	  int size = ls.size();
	   
	   List<String> ls1= new ArrayList();
	   ls1.add("1");
	   ls1.add("2");
	   ls1.add("3");
	   ls1.add("4");
	   System.out.println(ls1);
	   int size2 = ls.size();
	   
	   List<String> actual= new ArrayList();
	   
	   for(int i=0;i<size;i++) {
		   actual.add(ls.get(i));
			   actual.add(ls1.get(i)); 
			  
		   }
		   
	   
	   System.out.println(actual);

	   
	   
	   


	  }
}
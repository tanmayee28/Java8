package streams;

import java.util.ArrayList;
import java.util.List;

public class HelloClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>list=new ArrayList<String>();
		
		list.add("Bob");
		list.add("Alexa");
		list.add("Tanu");
		
		List<?>l=new ArrayList<Integer>();
		//l.add(null);
		List<? extends Number>l1=new ArrayList<Integer>();
	//	List<? super Number>l2=new ArrayList<Integer>(); C.E
		
		
		
		list.stream().map(ele->"Hello"+ele).forEach(System.out::println);
		
		list.stream()
		.map(e->e.substring(e.length()-2,e.length()))
		.map(e->e+e+e)
		.forEach(System.out::println);
		
		
		list.stream()
		.map(e->e.substring(1,e.length()-1))
		.forEach(System.out::println);
	}

}

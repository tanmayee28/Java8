package streams;

import java.util.ArrayList;

public class AggregateFunctions {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(7);
		al.add(19);
		al.add(23);
		
		int sum=al.stream().filter(element->element>10).reduce(100,(a,b)->a+b);
		System.out.println("Sum :"+sum);
		
		boolean mtch=al.stream().anyMatch(element->element.equals(45));
		System.out.println("anyMatch :"+mtch);
		
		boolean amtch=al.stream().allMatch(element->element>7);
		System.out.println("allMatch :"+amtch);
		
		
		boolean ntch=al.stream().anyMatch(element->element.equals(45));
		System.out.println("noneMatch :"+ntch);
		
		
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		
		System.out.println(i==i1);
		
	}

}

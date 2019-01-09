package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	/**
	 * @param args
	 */
	static ArrayList<Integer> alInt;
	static ArrayList<String>alString;
	
	static {
		alInt =new ArrayList<Integer>();
		alInt.add(2);
		alInt.add(12);
		alInt.add(18);
		alInt.add(12);
		alInt.add(10);
		alInt.add(5);
		
		alString=new ArrayList<String>();
		alString.add("xhnasd");
		alString.add("Qasd");
		alString.add("asSfd");
		alString.add("asfgd");
		alString.add("asd");
		alString.add("afhgAasd");
		
	}
	public static void main(String[] args) {
		
		//way 1
		Stream<Integer>stream = alInt.stream();
		Stream<String>Stringstream = alString.stream();
		
		//way 2
		Stream<Integer>stream2=Stream.of(12,3,4,5,6,7,8,9,20);
		
		// Aggregate: filter,map,limit,reduce,find,match
	    //  Terminal: collect( COllectors.methods.. );
		
		
		
		//Aggreagation actions
		//1.filter
		  Stream <Integer> resultStream = stream.filter(element->element<10).distinct();
	    //Stream<String> stringStream  = Stringstream.filter(str->str.equals("asd"));
		
		  Stream<String>result=Stringstream.map(str->str.replaceAll("a","")).map(str->str.replaceAll("d","T"));
		  
		  
		//int resultStream = stream.filter(i->i>10).mapToInt(i->i).sum();
		//System.out.println(resultStream.toString());
		
	//	Stream<String> stringStream2  = Stringstream.filter(str->str.contains("f"));
		
		
		
	
		//Terminal Operations
		Map<Object, Object> list = resultStream.collect(Collectors.toMap(element->element, element->element+10));
		System.out.println(list);
		
		List<String>rstring=result.collect(Collectors.toList());
		System.out.println(rstring);
		
		//List<String> listb = stringStream.collect(Collectors.toList());
		//System.out.println(listb);
		
	
		
		/*List<String> listc = stringStream2.collect(Collectors.toList());
		System.out.println(listc);*/
	}
	
	
	
	
	
	
}

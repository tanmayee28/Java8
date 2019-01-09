package streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="occurrence";
		String []sarr=str.split("");
		
		String []dup= {"abc","tanu","tanu","red","yellow","red"};
		Map<String, Long>m=Stream.of(sarr)
				.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(m);
		
		Map<String, Long> st=Stream.of(dup)
				.collect(Collectors
						.groupingBy(e->e,Collectors.counting()));
		System.out.println(st);
	}

}

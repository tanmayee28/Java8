package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BasicStreamLesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"tanu","sabha","ahdb","achal","Sohan"};
		String[]str1=Stream.of(arr).map(String::toUpperCase).toArray(String[]::new);
		//System.out.println(Arrays.toString(str1));
		
		//Stream.of(arr).filter(s->"tanu".equals(s)).forEach(System.out::println);
		
		String s=Stream.of(arr).peek(System.out::println).collect(Collectors.joining(","));
		System.out.println(s);
		//.reduce("shareen",(a,b)->a+b);
		
		Stream.of(arr).map(s1->s1.substring(0,2)).peek(System.out::println).forEach(a->a.length());
	}

}

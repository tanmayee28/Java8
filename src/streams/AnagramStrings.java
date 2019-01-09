package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramStrings {

	public static void main(String[] args) {
		String str="top";
		String str1="pot";
		
		String[]arr=str.split("");
		String[]arr1=str1.split("");
		
		List<String>l1=Stream.of(arr).sorted().collect(Collectors.toList());
		List<String>l2=Stream.of(arr1).sorted().collect(Collectors.toList());
		
		System.out.println(l1+"    "+l2);
		System.out.println(l1.equals(l2));
		if(l1.equals(l2))
		{
			
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}

	}

}

package lambda_Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambadaExpressionRevise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sfkgiregnbvr";
		words w=string->{
			String sarr[]=str.split("");
			List<String>ar=Arrays.asList(sarr);
			return ar.size();
		};
		System.out.println("Count :"+w.countLetters(str));
		
		ArrayList<String>al=new ArrayList<>();
		al.add("ADV");
		al.add("awfuie");
		al.add("uwery");
		al.add("qweeir");
		al.add("tansndi");
		
		//for each
		TreeSet<String>tset=new TreeSet<String>();
		al.stream().forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					// TODO Auto-generated method stub
					tset.add(t);
				}
		});
		System.out.println(tset);
		
		//streams..
		
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(12);
		a.add(45);
		a.add(8);
		a.add(1);
		a.add(72);
		a.add(68);
		
		Stream<Integer>i=a.stream().filter(element->element>9).limit(4);
		int sum=a.stream().filter(element->element>9).limit(4).reduce(0,(element,b)->element+b);
		System.out.println("Sum :"+sum);
		System.out.println(i.collect(Collectors.toList()));
	}

}
interface words
{
	int countLetters(String str);
}
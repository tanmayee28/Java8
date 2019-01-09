package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []input= {9,32,34,76,87,32};
		int stream=IntStream.of(input).min().getAsInt();
		System.out.println("Min:"+stream);
		

		//sum of the elements
		Optional<Integer> ab= IntStream.of(input).boxed().reduce((a,b)->a+b);
		ab.ifPresent(System.out::println);
		Integer ab1= IntStream.of(input).boxed().reduce(10,(a,b)->a+b);
		
		OptionalInt sum=IntStream.of(input).filter(a->a>13).reduce((a,b)->a+b);
		sum.ifPresent(System.out::println);
		
		/*
		List<Integer>io=IntStream.of(input)
				.boxed()
				.sorted(Comparator.comparingInt(e->(int)e).reversed())
				.collect(Collectors.toList());
		
		Map<Integer,Integer>map=IntStream.of(input).boxed()
		.collect(Collectors.toMap(i->i,i->i+10));
		
		System.out.println(map);
		*/
		/*System.out.println(io);
		
		//any one (First or last index ==6)
		int[]ind= {0,1,8,3,4,9,10};
		
		int index=IntStream.of(ind).boxed()
		.collect(Collectors.toList()).indexOf(6);
		System.out.println("index of 6 :"+index);
		
		GetTrue get=in->{
			
			if(in==0 || in==ind.length)
			{
				System.out.println(in);
				return true;
			}
			return false;
		
		};
		
		System.out.println("Arrays :"+get.getTrue(index));
		List<Integer>l=new ArrayList<>();
		l.add(1);
		l.add(3);
		l.add(4);
		
		//first and last index
		List<Integer>li=IntStream.of(ind).boxed()
				.collect(Collectors.toList());
		li.retainAll(l);
		System.out.println(li);
		
		
		//integer array converter
		Integer [] in=IntStream.of(ind)
		.boxed()
		.filter(i->i>2).toArray(Integer[]::new);
		System.out.println(Arrays.toString(in));
*/	}
}
interface GetTrue{
	
	boolean getTrue(int idex);
}
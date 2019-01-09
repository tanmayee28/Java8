package forEachLopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapIteration {

	public static void main(String[] args) {
/*		Map<Integer,String>hmap=new HashMap<>();
		hmap.put(3,"sdusf");
		hmap.put(54,"ouiiye");
		hmap.put(8,"ojit");
		hmap.put(97,"yjy");
		hmap.put(123,"sekj");
		
		
		Set<Entry<Integer,String>>hset=hmap.entrySet();
		
		//hmap iterator
		//hset.stream().forEach(e->System.out.println(e));
		
		//ordered
		Collection<String>list=hmap.values();
		List<String>al=new ArrayList<>(list);
		
		hset.stream().
		sorted(Comparator.comparing(Entry<Integer,String>::getKey)
				.reversed()).forEach(System.out::println);
		
		al.stream()
		.sorted(Comparator.comparing((s1,s2)->{
			return s1.compareTo(s2);
		} ); )
		.forEach(System.out::println);
		
		Set<Integer>hm=hmap.keySet();
		
		hm.stream().map(ele->ele-10)
		.sorted(Comparator.comparingInt(e->(int)e)
				.reversed()).forEach(System.out::println);
		
		//max salary
		
		
		
		//sum
		long sum=hm.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
		System.out.println("sum :"+sum);
		
		//sum by reduce
		hm.stream().reduce((a,b)->a+b).ifPresent(System.out::println);*/
		
		
		
		
		
		Map<Integer,String>hmap1=new HashMap<>();
		Set<Integer>fs=hmap1.keySet();
		Optional<Integer>opt=fs.stream().findFirst();
		opt.ifPresent(System.out::println);
		//System.out.println(opt.get());
		
		
		
		
		
		
		
		
		
		
		
	}

}

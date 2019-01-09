package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Tanmayeee
 * 
 * 
 * What is Stream?
Stream represents a sequence of objects from a source, which supports aggregate operations.

Sequence of elements − A stream provides a set of elements of specific type in a sequential manner. 
A stream gets/computes elements on demand. It never stores the elements.

Source − Stream takes Collections, Arrays, or I/O resources as input source.

Aggregate operations − Stream supports aggregate operations like filter, map, limit, reduce, find, match etc.

Pipelining − Most of the stream operations return stream itself so that their result can be pipelined.
These operations are called intermediate operations and their function is to take input, process them
and return output to the target. collect() method is a terminal operation which is normally present 
at the end of the pipelining operation to mark the end of the stream.

Automatic iterations − Stream operations do the iterations internally over the source elements provided, 
in contrast to Collections where explicit iteration is required.

Generating Streams
With Java 8, Collection interface has two methods to generate a Stream.

1. stream() − Returns a sequential stream considering collection as its source.
2. parallelStream() − Returns a parallel Stream considering collection as its source.
 * 
 *
 * IMP+
 *  java.util.stream.Collectors.. (used inside collect method)
 *  
 *  Aggregate: filter,map,limit,reduce,find,match
 *  Terminal: collect( COllectors.methods.. );
 */
public class MyStream {	
	
	/**
	 * 
       IntStream java.util.Random.ints()
       Returns an effectively unlimited stream of pseudorandom int values. 
	 */
	public static void main(String[] args) {
      
		//foreach
		/*Random random = new Random();		
		random.ints().limit(10).forEach(System.out::println);
		*/
		
		//map : The ‘map’ method is used to map each element to its corresponding result
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i)
				.distinct()
				.collect(Collectors.toList());		
		System.out.println(squaresList);
		
		//filter : The ‘filter’ method is used to eliminate elements based on a criteria.
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		int count = (int) strings.stream().filter(mystr -> mystr.contains("bc")).count();
		System.out.println(count);
		
		//get count of string of length more than 3		
		int count2 = (int) strings.stream().filter(string -> string.length()==4).count();
	      System.out.println("Strings of length 3: " + count2);
		
	     
	}
}

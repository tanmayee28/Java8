package streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortStream {

	public static void main(String[] args) {
		String str="abc123";
		String []sarr=str.split("");
		//java 8
		Stream.of(sarr).sorted(Comparator.comparing(s->s)).forEach(System.out::print);

		//java 7
		char []arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char x=arr[i];
					arr[i]=arr[j];
					arr[j]=x;
				}
				
			}
			System.out.print(arr[i]);
		}
	}

}

package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeString {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String pali=br.readLine();
		pali.length();
		String rev=Stream.of(pali).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(""));
		System.out.println("Reverese :"+rev);
		
		/*String st=Stream.of(pali).filter((s)->s.equals(Stream.of(s)
				.map(word1->new StringBuilder(word1).reverse()))).collect(Collectors.joining(""));
*/
		if(pali.equals(rev))
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}


}

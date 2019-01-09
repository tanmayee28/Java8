package forEachLopp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<String>();
		
		al.add("ABC");
		al.add("AC");
		al.add("YC");
		al.add("BCD");
		al.add("XYZ");
		
		al.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				if(t.contains("A"))
				{
					System.out.println("Inside for each loop :"+t.replaceAll("A",""));
				}
			}	
			
		});

	}

}

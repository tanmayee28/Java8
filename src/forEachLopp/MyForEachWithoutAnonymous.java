package forEachLopp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyForEachWithoutAnonymous {

	void dowork( String g) {
		System.out.println(Thread.currentThread().getName()+":"+g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>al=new ArrayList<String>();
		
		al.add("Tanmayee");
		al.add("Pranjali");
		al.add("Sushant");
		al.add("Ninad");
		al.add("Monalisa");
		al.add("Waghu");
		al.add("Saundarya");
		
		MyConsumer action=new MyConsumer();
		al.forEach(action);
		
		/*al.parallelStream().forEach(element-> new MyForEachWithoutAnonymous().dowork(element));
		al.parallelStream().forEach(element-> element.toUpperCase());*/
		
		System.out.println(al);
		al.parallelStream().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Parallel execution of  : "+Thread.currentThread().getName()+":"+t);
				
			}
			
		});

	}
	
}
class MyConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		if(t.contains("a"))
		{
			System.out.println(t.replaceAll("a","T"));
		}
	}
	
}

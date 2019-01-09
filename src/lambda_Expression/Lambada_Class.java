package lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface Functional{
	public abstract void make();
	static void m1()
	{
		System.out.println("Hii");
	}
	default void m2()
	{
		System.out.println("hellooo");
	}
}
public class Lambada_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functional ab=()->{
			System.out.println("Make");
		};
		ab.make();
		
		
		
		
		Runnable r=()->{
			System.out.println("Thread creation :"+Thread.currentThread().getName());
		};
		Thread th=new Thread(r,"Tanmayee");
		th.start();
		
		//with paranthessis
		myInterface my= abc->{ System.out.println("I am inside my method :"+abc);};
		
		// (int a)->{System.out.println("HI");};
		ArrayList<String>al=new ArrayList<>();
		
		al.add("BCS");
		al.add("YXD");
		al.add("chuidv");
		al.add("WcfrT");
		al.add("AXd");
		Comparator<String> c=(String s1,String s2)->
		{
			return s1.compareTo(s2);
		};
		Collections.sort(al,c);
		System.out.println(al);
		
		System.out.println("First Lambda Method invokation :");
		my.myMethod(10);
		
		//without paranthesis	
		
		myInterface my1=a->System.out.println("Method without Paranthesis :" +a);
		System.out.println("First Lambda Method invokation without Paranthesis :");
		my1.myMethod(15);
		
		
		Addition add=(int a,int b)->{
			System.out.println("First NO :"+ a);
			System.out.println("Second No :"+ b);
			return a+b;
			
		};
		
		System.out.println("Addition of two nos :"+ add.addition(10,15));
		
		Multiplication mul=(int a,int b)->{
			System.out.println("First No :"+ a);
			System.out.println("Second No :"+ b);
			return a*b;
		};
		
		System.out.println("Multiplication of two nos :"+ mul.multiplication(10,15));
	
		
		String s1=new String("AB");
		String s2="AB";
		String s3="AB";
		System.out.println("s3==s2"+(s3==s2));
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer i=10;
		System.out.println("i1==i2"+(i2==i1));
		System.out.println("i==i2"+(i==i1));
		
	}

}
interface myInterface
{
	public void myMethod(int a);
}

interface Addition
{
	public int addition(int a,int b);
}

interface Multiplication
{
	public int multiplication(int a,int b);
}
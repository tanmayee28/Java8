package defaultAndstaticMethods;

public class Static_Default_Class implements function1,function2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		function1.super.m2();
	}
	public static void main(String[]args)
	{
		Static_Default_Class s=new Static_Default_Class();
		s.method1();
		s.m2();
		s.method2();
	}
}
interface function1
{
	void method1();
	 public static void m1()
	 {
		 System.out.println("Inside static method..");
	 }
	 public default void m2()
	 {
		 System.out.println("Inside deault method.. ");
	 }
}

interface function2
{
	void method2();
	
	public static void m3()
	 {
		 System.out.println("Inside static method 2..");
	 }
	 public default void m2()
	 {
		 System.out.println("Inside deault method 2.. ");
	 }
}
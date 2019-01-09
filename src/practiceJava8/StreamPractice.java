package practiceJava8;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
	
		Student s=new Student(1,"tan","DB",90.0);
		Student s1=new Student(12,"Sumit","JAVA",65);
		Student s2=new Student(8,"ninad","Datastructure",78);
		Student s3=new Student(55,"swati","C",87);
		Student s4=new Student(23,"sabha","C",65);
		Student s5=new Student(34,"Pooja","JAVA",98);
		Student s6=new Student(44,"Sushant","DB",90);
		
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		
			//arrane in dec order of student name
			System.out.println("Descending order by Student Name :");
			al.stream().sorted(Comparator
					.comparing(Student::getStudentName)
					.reversed()).forEach(System.out::println);
			
			//arrange ascending order by marks
			System.out.println("\n");
			System.out.println("Ascending oder by marks");
			al.stream().sorted(Comparator
					.comparingDouble(Student::getMark))
			.forEach(System.out::println);
			
		//group by marks	
			System.out.println();
			System.out.println("Grouping by marks:");
			Map<Double, List<Student>> hmap=al.stream()
					.collect(Collectors
							.groupingBy(Student::getMark));
			System.out.println(hmap);
			
		//marks wise count of students
			System.out.println();
			System.out.println("Marks wise count of students :");
			Map<Double, Long> group=al.stream()
					.collect(Collectors
							.groupingBy(Student::getMark,Collectors.counting()));
			System.out.println(group);
			
		//reverse student name
			System.out.println();
			System.out.println("Reverse the student name : ");
			al.stream().map(a->a.StudentName)
			.map(a->new StringBuffer(a).reverse())
			.forEach(System.out::println);
		
			
		//Max of marks
			System.out.println();
			System.out.println("Max of the Marks:");
			double max=al.stream()
					.collect(Collectors
							.summarizingDouble(Student::getMark))
					.getMax();
			System.out.println(max);
			
		//min of marks
			System.out.println();
			System.out.println("Minimum Marks :");
			double min=al.stream().
			collect(Collectors
					.summarizingDouble(Student::getMark))
						.getMin();
			System.out.println(min);
			
		//avg marks
			System.out.println();
			System.out.println("Average Marks:");
			double avg=al.stream().collect(Collectors
					.summarizingDouble(Student::getMark))
					.getAverage();
			System.out.println(avg);
			
		//name wise sorting
			System.out.println();
			System.out.println("Name wise sorting in ascending :");
			al.stream()
			.sorted(Comparator.comparing(Student::getStudentName)
					).forEach(System.out::println);
			
		//Mark and name wise sorting
			System.out.println();
			System.out.println("Mark then Name wise sorting :");
			al.stream()
			.sorted(Comparator.comparing(Student::getMark)
					.thenComparing(Student::getStudentName))
				.forEach(System.out::println);
			
			//Max marks subject wise
			System.out.println();
			System.out.println("Subject wise Max marks :");
			Map<String, Optional<Student>> maxdept=al.stream()
			.collect(Collectors
					.groupingBy(Student::getSub,Collectors
							.maxBy(Comparator.comparing(Student::getMark))));
			
			System.out.println(maxdept);
			
			//subject wise min marks
			System.out.println();
			System.out.println("Subject wise min marks:");
			Map<String, Optional<Student>> minmark=al.stream()
			.collect(Collectors.groupingBy(Student::getSub,Collectors
					.minBy(Comparator.comparing(Student::getMark))));
			
			System.out.println(minmark);
			
		
			
	}

}
class Student{
	int sId;
	String StudentName;
	String sub;
	double mark;
	public Student(int sId, String studentName, double mark) {
		super();
		this.sId = sId;
		StudentName = studentName;
		this.mark = mark;
	}
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public Student(int sId, String studentName, String sub, double mark) {
		super();
		this.sId = sId;
		StudentName = studentName;
		this.sub = sub;
		this.mark = mark;
	}


	public int getsId() {
		return sId;
	}
	
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", StudentName=" + StudentName + ", sub=" + sub + ", mark=" + mark + "]";
	}
	
	
}
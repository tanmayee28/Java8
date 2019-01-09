package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee(10012,"Tanu",dept.DEVLOPER,60000,city.PUNE);
		Employee e1=new Employee(23304,"Tanu",dept.DEVLOPER,50000,city.HYDRABAAD);
		Employee e2=new Employee(34565,"Madhuri",dept.TESTER,35000,city.MUMBAI);
		Employee e3=new Employee(24007,"Ninad",dept.DEVLOPER,35000,city.PUNE);
		Employee e4=new Employee(35700,"Sabha",dept.TESTER,40000,city.MUMBAI);
		Employee e5=new Employee(80012,"Sabha",dept.OTHER,40000,city.HYDRABAAD);
		Employee e6=new Employee(70034,"Sonali",dept.OTHER,10500,city.MUMBAI);
		List<Employee>emp=new ArrayList<>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		//max salary
		
		Optional<Employee> sal=emp.stream()
				.collect(Collectors.maxBy(Comparator
						.comparingDouble(Employee::getSalary)));
		sal.ifPresent(System.out::println);
		
		
		//dep wise max salary
		Map<dept, Optional<Employee>> map=emp.stream()
				.collect(Collectors
						.groupingBy(Employee::getEmpdep,Collectors
								.maxBy(Comparator
										.comparing(Employee::getSalary))));
		System.out.println(map);
		
		//dept wise average salary
		
		Map<dept, Double> hsldep=emp.stream()
		.collect(Collectors
				.groupingBy(Employee::getEmpdep,Collectors
						.averagingDouble(Employee::getSalary)));
		
		System.out.println(hsldep);
		
		//summaryStatistics
		DoubleSummaryStatistics s=emp.stream()
				.collect(Collectors
						.summarizingDouble(Employee::getSalary));
		System.out.println("Max :" +s.getMax());
		
		
		
		
		/*
		//Reverse by salary
		//way1
		List<Employee>rev=emp.stream().
		sorted(Comparator.comparing(Employee::getSalary).reversed())
		.collect(Collectors.toList());
		
		System.out.println("Reverse By Salary :"+rev);
		
		
		
		//way2 Reverse by name
		emp.sort((o1,o2)->o2.empname.compareTo(o1.empname));
		System.out.println("Reverse Order:"+emp);
		
		
		//sort by name and salary
		emp.stream().sorted(Comparator.
				comparing(Employee::getSalary)
				.thenComparing(Employee::getEmpname)).forEach(System.out::println);
	
		
		//Total Salary way-1
		double sum= emp.stream().
				collect(Collectors
						.summarizingDouble(Employee::getSalary)).getSum();
		System.out.println("Sum of salary :"+sum);
		
				
		
		//Sum by salary way-2
				emp.stream().map(empl->empl.getSalary())
				.reduce((abc,bcd)->abc+bcd)
				.ifPresent(System.out::println);
				
		//sum way3
				
			emp.stream().map(end->end.getSalary())
			.forEach(new Consumer<Double>()
					{
						double dsum=0.0;
						public void accept(Double d)
						{
							dsum+=d;
							System.out.println(dsum);
					}
						
					});
															
		
		
		//Dept wise employee sorting
		Map<dept, List<Employee>> hm=emp.stream()
				.collect(Collectors.groupingBy(Employee::getEmpdep));
		//System.out.println(hm);
		
		//Name wise employee sorting
		Map<String, List<Employee>> r =emp.stream().collect(Collectors.groupingBy(Employee::getEmpname));
		//System.out.println(r);
		
		//gives error when duplicate Key occure ..(toMap method)
		Map<dept, Employee> s=emp.stream().collect(Collectors.toMap(Employee::getEmpdep,emde->emde));
		System.out.println(s);
		
		
		//Max salary
		Optional<Double>dbmax=emp.stream()
				.map(employee->employee.getSalary())
				.reduce(Double::max);
		System.out.println("Max Salary :"+dbmax);
		
		//count by name way 1
		Map<String, Long> m=emp.stream()
				.collect(Collectors
						.groupingBy(Employee::getEmpname,Collectors.counting()));
		System.out.println("Count by name :"+m);
		
		//count by name way 2
		
		Map<String,Long>hmap=emp.stream().map(shareen->shareen.empname).collect(Collectors.groupingBy(ed->ed,Collectors.counting()));
		System.out.println("count by name way 2:"+hmap);
		
		
		//Dept wise max
		emp.stream().collect(Collectors
					.groupingBy(Employee::getEmpdep,BinaryOperator
							.maxBy((Comparator.comparingDouble(Employee::getSalary))));
	
	
	
*/		
		
	}

}

class DeptName
{
	dept edept;

	public DeptName(dept edept) {
		super();
		this.edept = edept;
	}
	
	public dept getEdept() {
		return edept;
	}

	public void setEdept(dept edept) {
		this.edept = edept;
	}

	@Override
	public String toString() {
		return "DeptName [edept=" + edept + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edept == null) ? 0 : edept.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptName other = (DeptName) obj;
		if (edept != other.edept)
			return false;
		return true;
	}
	
	
}
class Employee 
{
	int empid;
	String empname;
	dept empdep;
	double salary;
	city ecity;
	
	
	
	public Employee(int empid, String empname, dept empdep, double salary, city ecity) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdep = empdep;
		this.salary = salary;
		this.ecity = ecity;
	}


	
	public dept getEmpdep() {
		return empdep;
	}



	public void setEmpdep(dept empdep) {
		this.empdep = empdep;
	}



	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public city getEcity() {
		return ecity;
	}


	public void setEcity(city ecity) {
		this.ecity = ecity;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", ecity=" + ecity + "]";
	}


}
enum city
{
	PUNE,
	MUMBAI,
	BANGLORE,
	HYDRABAAD;
	
}
enum dept
{
	DEVLOPER,
	TESTER,
	OTHER;
	
}
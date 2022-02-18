package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.setAddress("Blr");
		emp1.setFname("Raj");
		emp1.setId(100);
		emp1.setLname("RajLast");
		emp1.setPhone(12345);
		emp1.setSalary(50000.0);
		
		Employee emp2 = new Employee();
		emp2.setAddress("Hyd");
		emp2.setFname("Arun");
		emp2.setId(101);
		emp2.setLname("ArunLast");
		emp2.setPhone(12345);
		emp2.setSalary(120000.0);
		
		Employee emp3 = new Employee();
		emp3.setAddress("Chennai");
		emp3.setFname("Rak");
		emp3.setId(102);
		emp3.setLname("RakLast");
		emp3.setPhone(12345);
		emp3.setSalary(40000.0);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList);
		System.out.println(empList.size());
		
		// Before java8
		System.out.println("Before java8");
		List<Employee> greaterThan1Lack = new ArrayList<Employee>();
		for(Employee emp : empList)
		{
			if(emp.getSalary() > 100000)
			{
				greaterThan1Lack.add(emp);
			}
		}
		System.out.println(greaterThan1Lack);
		
		// From java8
		System.out.println("From java8");
		List<Employee> greaterThan1LackList = empList.stream().filter(e -> e.getSalary() > 100000).collect(Collectors.toList());
		System.out.println(greaterThan1LackList);
	}
}

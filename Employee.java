//find out what is the problem in the class 

class Employee{
	int id;
	String name;
	public Employee(int id, String name){
		 this.id = id;
		 this.name = name;
	}
	
}
class register{
   Map<Employee, int> mapEmployee = new Hashmap<>();
   mapEmployee.put(new Employee(1,"Ravi"),1);
   mapEmployee.put(new Employee(1,"Ravi"),1);
}

//ans

class Employee{
	int id;
	String name;
	public Employee(int id, String name){
		 this.id = id;
		 this.name = name;
	}
	//I told her to add hashcode and equals to avoid duplicate entry. she told me to write equals and hashcode method so wrote code for equals
	equals(Employee o){
			
	    return (this.o.id == o.id) && (this.name.equals(name));
			
		
	}
}
class register{
	//change int to integer
   Map<Employee, Integer> mapEmployee = new Hashmap<>();
   mapEmployee.put(new Employee(1,"Ravi"),1);
   mapEmployee.put(new Employee(1,"Ravi"),1);
}

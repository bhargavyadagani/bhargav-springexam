package chip22.batch;

public class question2 
{
	int sid;
	String name;
	String dept;
	double salary;
	public question2(int sid, String name, String dept, double salary) {
		super();
		this.sid = sid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "model [sid=" + sid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
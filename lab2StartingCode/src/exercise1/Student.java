package exercise1;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student other) {
		// result;
		int nameComparison = this.name.compareTo(other.name);   
		if(nameComparison != 0) {
			return nameComparison;
		}
		return Integer.compare(this.age, other.age);
		
	}
	
	@Override
	public String toString() {
		return name + " Age: "+ age + "";
	}
}

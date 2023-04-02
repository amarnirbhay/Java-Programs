package String;

public class Student {
	int rollNo;
	String name;
	Student (int rollNo, String name){
		
		this.rollNo=rollNo;
		this.name = name;
	}
	public String toString()
	{
		return rollNo+" "+name;
	}
	public static void main(String[] args) {
		Student s=new Student(101, "Manmohan");
		System.out.println(s);
		System.out.println(s.toString());
	}
}

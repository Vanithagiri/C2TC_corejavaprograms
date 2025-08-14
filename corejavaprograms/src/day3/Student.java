package day3;

public class Student {
	public int sid;
	private String sname;
	
	//default constructor
	public Student()
	{
		System.out.println("constructor called...");
	}
	//parameterized constructor
	public Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	

}

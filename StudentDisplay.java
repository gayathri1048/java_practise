public class StudentDisplay extends Student1{
	public String branch;
	private int graduationYear=2024;
	public StudentDisplay(String name)
	{
		super.Studentname(name);
	}
	public void displayDetails()
	{
		System.out.println(super.name+" "+branch+" "+graduationYear);
	}
	

}

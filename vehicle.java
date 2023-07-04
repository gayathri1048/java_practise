public class vehicle {
	 protected String color;
	int maxspeed;
	public void print()
	{
		System.out.println(color+" : "+maxspeed);
	}
//	public vehicle() {
//		System.out.println("Vehicle constructor");
//	}
//	public vehicle(int maxspeed)
//	{
//		this.maxspeed=maxspeed;
//	}
	public void setMaxSpeed(int maxspeed)
	{
		this.maxspeed=maxspeed;
	}
	public int getMaxSpeed()
	{
		return this.maxspeed;
	}


}

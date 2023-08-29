public class vehicleUse extends vehicle{
	public static void main(String[] args)
	{
		vehicle v=new vehicle();
		v.color="Black";
		v.setMaxSpeed(100);
//		v.maxspeed=100;
		v.print();
		car c=new car();
		c.color="Red";
//		c.maxspeed=120;
		c.setMaxSpeed(120);
		c.numGears=8;
		c.print();
	}

}

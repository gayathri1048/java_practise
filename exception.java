public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("open files");
			int n=args.length;
		    int a=45/n;
			System.out.println("a="+a);
			int b[]= new int[60];
			b[50]=100;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Please provide data");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
			System.out.println("select a valid index");;
		}
		finally {
			System.out.println("close the file");
		}

	}

}
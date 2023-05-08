public class arrayindex {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        System.out.println("array is created");
        try {
            a[6]=15;
            System.out.println("array is updated");

        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae);
            System.out.println("exception occured");
        }
        finally{
            System.out.println("close");
        }
        

    }
}

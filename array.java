import java.util.Scanner;
public class array {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int size=s.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
        System.out.println("Enter the array element of "+i+"th index: ");
        arr[i]=s.nextInt();

    }
    for(int j=0;j<size;j++)
    {
        System.out.println(arr[j]);
    }
}
}
// Program to search a non repeating number
import java.util.*;
class srch
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int arr[]= new int[15];
        System.out.println("Enter 15 numbers: ");
        for(i=0;i<15;i++)
        {
            arr[i]=sc.nextInt();
        }   
        int x=0;
        for(i=0;i<15;i++)
        {
            x=x^arr[i];
        }   
        System.out.println("The non repeatig no is : "+x);

    }
}
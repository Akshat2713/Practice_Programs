import java.util.*;
class Trail
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num;
        num=in.nextInt();
        int i,result=0;
        for(i=5;i<=num;i*=5)
        {
            result=result+ num/i;
        }
        System.out.println("The numbers of zero in "+num+" factorial is: "+result);
        in.close();
    }
}
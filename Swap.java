import java.util.*;
class Swap
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Befor swapping: "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: "+a+" "+b);
    }
}
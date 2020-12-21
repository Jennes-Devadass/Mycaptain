import java.util.Scanner;
public class Area
{
    public static void main(String args[])//method to find out area
    {
        int a,b;
        
        int area=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        if(a==b)
        {
            area=a*a;
            System.out.println("AREA OF SQUARE = "+area);
        }
        else if(a!=b)
        {
            area=a*b;
            System.out.println("AREA OF RECTANGLE = "+area);
        }
    }
}
            
            
        
        
        
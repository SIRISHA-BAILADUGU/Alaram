import java.util.*;
class Alaram
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String alaram=sc.next();
        while(!(alaram.equalsIgnoreCase("cancel")))
        {
           System.out.println("Wake up"); 
           alaram=sc.next();
        }
    }
}
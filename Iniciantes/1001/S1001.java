import java.util.Scanner;

public class S1001 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(), 
            b = scanner.nextInt();
        scanner.close();
        
        System.out.println("X = " + (a + b));
    }
}
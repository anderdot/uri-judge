import java.util.Scanner;

public class S1044 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(),
            B = scanner.nextInt();
        scanner.close();

        if (A%B == 0 || B%A == 0) 
        {
            System.out.println("Sao Multiplos");
        } 
        else 
        {
            System.out.println("Nao sao Multiplos");
        }
    }
}
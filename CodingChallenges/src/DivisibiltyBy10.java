import java.util.Scanner;

public class DivisibiltyBy10
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    if (num < 1)
    {
      System.out.println("Invalid input. Number must 1 or greater!");
      System.exit(0);
    }
    if (num % 10 == 0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}

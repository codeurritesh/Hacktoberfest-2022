import java.util.Scanner;
public class Deletion_Of_An_Element_From_An_Array_Using_Position
{
    public static void main(String[] args)
    {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements in array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter values");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter position of value to be deleted");
        m = sc.nextInt();
        for (int i = (m - 1); i < n-1; i++)
        {
            a[i] = a[i + 1];
        }
        System.out.println("elements are:");
        for (int i = 0; i < (n - 1); i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

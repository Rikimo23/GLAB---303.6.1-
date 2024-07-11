import java.util.Scanner;
public class insertElements
{
    public static void main(String[] args)
    {
        int i, element;
        int[] arr = new int[7];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 6 Elements: ");
        for(i=0; i<6; i++)
            arr[i] = scan.nextInt();

        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\nNow the new array is: ");
        for(i=0; i<7; i++)
            System.out.print(arr[i]+ " ");
    }
}


import java.util.*;
import java.util.Scanner;


public class TwoSum {

    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s1.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i =0;i<n;i++)
        {
            arr[i] = s1.nextInt();

        }

        System.out.println("Enter the target sum");
        int target = s1.nextInt();

        for(int i=0;i<n;i++)
        {
            int sum = 0;

            for(int j=i+1;j<n;j++)
            {
                sum =arr[i] + arr[j];

                if(sum ==target)
                {
                    System.out.println("The two numbers are: " + arr[i] + " and " + arr[j]);
                    System.out.println("The indices are: " + i + " and " + j);
                    break;
                }
                
            }
        }
        System.out.println("No such pair found");
        s1.close();
        
    }
    
}

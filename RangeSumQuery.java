import java.util.*;
import java.util.Scanner;

public class RangeSumQuery {
    public static void main(String[] args) {
        //int a[]={1,3,6,25,4,32,7};
        System.out.println("Range Sum Query using Prefix Sum Array");
        // This program calculates the prefix sum of an array and allows querying the sum of elements in a given range.
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s1.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=s1.nextInt();
        }
        
        int size=a.length;
        int result[]=new int[size];
        result[0]=a[0];
        for(int i=1;i<size;i++)
        {
            result[i]=a[i]+result[i-1];
        }
        System.out.println("The original Array is : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n New prefix sum array is :");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(result[i] + " ");
       
        }   
        int sum =0;
        System.out.println("\nEnter the range of sum");
        System.out.println("Enter the starting index");
        int l=s1.nextInt();
        System.out.println("Enter the ending index");
        int r=s1.nextInt();

        if(l==0)
        {
            sum=result[r];
        }
        else
        {
            sum=result[r]-result[l-1];
        }
        System.out.println("The sum of the range is : "+sum);
    }
    
    

    
}

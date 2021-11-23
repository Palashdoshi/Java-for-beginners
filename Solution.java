import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        int no;
        Scanner s = new Scanner(System.in);
     //   System.out.println("Enter the quantity of nos to fact");
        no =Integer.parseInt(s.nextLine());
        int Size = no;
        if(Size>100 || Size<1)
        {
            System.out.println("error : Size less than 1 or greater than 100");
            System.exit(0);
        }
        int arr[] = new int[Size];
   // System.out.println("Enter "+no+" numbers for fact");
       for(int i =0;i<Size;i++)
        {   
            
            arr[i]=Integer.parseInt(s.nextLine());
            if(arr[i]>1000 || arr[i]<0)
        {
            System.out.println("error : No less than 0 or greater than 1000");
            System.exit(0);
        }
        }
        int result = 1;
        int results[] = new int[Size];
        for(int n = 0;n<Size;n++){
             for(int i = 1;i<=arr[n];i++){
                result *= i;
            }
            results[n] = result;
            result = 1;
        }
       /* for(int i= 0;i<Size;i++){
            System.out.println(results[i]);
           
        }*/
        for(int i= 0;i<Size;i++){
            int sum = 0;
          int n = results[i];
            while (n != 0)
            {
                sum = sum + n % 10;
                n = n/10;
            }
          System.out.println(sum);
        }
       


s.close();
}
}
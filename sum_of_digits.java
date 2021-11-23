public class sum_of_digits {
    public static void main(String[] args) {
        int arr[] = {12, 23, 45, 76};
        for(int i=0;i<4;i++)
        {
            System.out.println(getSum(arr[i]));
        }

    }
    static int getSum(int n)
    {    
        int sum = 0;
          
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
      
    return sum;
    }

}

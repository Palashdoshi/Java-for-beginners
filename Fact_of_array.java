public class Fact_of_array {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3,5,7};
        fact(ar);
       
    }
    private static int fact(int[] arr){
        int result = 1;
        int results[] = new int[5];
        for(int n = 0;n<5;n++){
             for(int i = 1;i<=arr[n];i++){
                result *= i;
            }
            results[n] = result;
            result = 1;
        }
        for(int i= 0;i<5;i++){
            System.out.println(results[i]);
           
        }
        for(int i= 0;i<5;i++){
            System.out.print(getSum(results[i])); 
          
        }
        return 0;
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
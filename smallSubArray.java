import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

     int min = subArrayWithGreaterSum(arr,k);
     System.out.println(min);
    }

    public static int subArrayWithGreaterSum(int[] arr,int k){
     int min_len = arr.length + 1;
      int cur_sum = 0, start=0, end=0;
      while(end < arr.length){
      while(cur_sum < k && end < arr.length){
          cur_sum = cur_sum+arr[end];
          end++;
      }

      while((cur_sum >= k) && (start < arr.length)){
          if(end-start < min_len)
          min_len = end-start;

          cur_sum = cur_sum - arr[start];
          start++;
      }
      
      }
      if(min_len > arr.length)
      return 0;
      else
      return min_len;
    }
}

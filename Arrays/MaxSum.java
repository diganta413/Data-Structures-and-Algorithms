public class MaxSum {
    static long maxSubarraySum(int ar[], int n){
         long max = Integer.MIN_VALUE;
         int i = 0;
         for(i=0;i<n;i++){
             if(i==0 || i==n-1){
                int j;
                long s = 0;
                for(j=0;j<n;j++){
                    s = s + ar[j]; 
                }
                if(s>max)
                max=s;
            }
            else{
                int j;
                long s=0,s1=0,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
                for(j=0;j<=i;j++){
                    s=s+ar[j];
                    if(s>max1)
                    max1=s;
                }
                for(j=i;j<n;j++){
                    s1=s1+ar[j];
                    if(s1>max2)
                    max2=s1;
                }
                    //System.out.println(max1);
                    //System.out.println(max2);
                //System.out.println(max1);
                if(max1>=max2 && max1>max)
                max=max1;
                
                if(max2>=max1 && max2>max)
                max=max2;
                //System.out.println(max);    
            }
         }
         //last check
         for(i=0;i<n;i++){
             if(ar[i]>max)
             max = ar[i];
         }
         return max;
    }
    public static void main(String[] args) {
        int[] arr =  new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        long max = maxSubarraySum(arr, 9);
        System.out.println(max);
    }
}

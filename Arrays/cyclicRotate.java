public class cyclicRotate {
   static void rotate(int[] ar,int n){
       int temp = ar[n-1];
       int i = n-1;
       while(i>=0){
            if(i==0)
            ar[i] = temp;
            else
            ar[i] = ar[i-1];
            i--;
       }
   }
   
   public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,4};
        rotate(ar, 4);
        System.out.println(ar[0]);    
   }
}

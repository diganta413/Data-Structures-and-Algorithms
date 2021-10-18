public class NegPos {
   static void move(int[] ar,int l,int r){
        int temp;   
        while(l<=r){
           if(ar[l]>0 && ar[r]<0){
               temp = ar[r];
               ar[r] = ar[l];
               ar[l] = temp; 
           }
           else if(ar[l]<0 && ar[r]<0){
               l++;
           }
           else if(ar[l]>0 && ar[r]>0){
               r--;
           }
           else{
               l++;
               r--;
           }
       }
   }
   public static void main(String[] args) {
       int ar[] = new int[]{1,-2,2,3,-4,-5};
       move(ar, 0, 5);
       for(int i=0;i<6;i++){
        System.out.println(ar[i]);
    } 
   } 
}

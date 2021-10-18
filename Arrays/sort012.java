public class sort012 {
   static void sort(int[] ar,int n){
        int i;
        int n1=0,n2=0,n3=0;
        for(i=0;i<n;i++){
            if(ar[i] == 0)
            n1++;
            if(ar[i] == 1)
            n2++;
            if(ar[i] == 2)
            n3++;
        }
        int j=0;
        while(j<n){
            if(j<n1)
            ar[j] = 0;
            else if(j<n2+n1)
            ar[j] = 1;
            else
            ar[j] = 2;
            j++;
        }
   } 

   public static void main(String[] args) {
       int ar[] = new int[]{1,0,0,2};
       sort(ar, 4);
       for(int i=0;i<4;i++){
           System.out.println(ar[i]);
       } 
   }
}

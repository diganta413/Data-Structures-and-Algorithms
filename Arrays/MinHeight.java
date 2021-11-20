import java.util.*;
public class MinHeight {
    static void sort(int[] ar,int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(ar[j]>ar[i]){
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    
    static int minHeight(int[] ar,int n,int k){
        sort(ar, n);
        int max = ar[n-1]-k;
        int min = ar[0]+k;
        int diff = ar[n-1]-ar[0];
        int i;
        for(i=0;i<n-1;i++){
            int sum = Math.max(ar[i]+k, max);
            int dif = Math.min(ar[i+1]-k,min);
            if(dif<0)
                continue;
            diff = Math.min(diff, sum-dif);
        }
        return diff;
    }
    

    public static void main(String[] args) {
        int[] ar = new int[]{6, 1, 9, 1, 1, 7, 9, 5, 2, 10};
        int diff = minHeight(ar, 10, 4);
        System.out.println(diff);
    }
}

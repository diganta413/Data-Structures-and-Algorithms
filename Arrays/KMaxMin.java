import java.util.Arrays;

class KMaxMin{
    static int KMin(int[] ar,int k,int l,int r){
        Arrays.sort(ar);
        return ar[k-1];                        
    }

    static int KMax(int[] ar,int k,int l,int r){
        Arrays.sort(ar);
        return ar[ar.length - k];
    }

    public static void main(String[] args){
        int[] ar = new int[]{2,1,3,9,4};
        System.out.println(KMin(ar, 1, 0, ar.length - 1));
        System.out.println(KMax(ar, 2, 0, ar.length - 1));
    }
}
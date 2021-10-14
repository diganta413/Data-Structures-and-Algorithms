public class arrayReverse{

    public static void swap(int[] ar,int a,int b){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }


    public static void reverse(int[] ar){
        int i=0,j=(ar.length - 1);
        while(i<=j){
            swap(ar, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] ar = new int[]{1,2,3,4};
        arrayReverse.reverse(ar);       
        int i;
        for(i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
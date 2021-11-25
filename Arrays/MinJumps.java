public class MinJumps {

    static int minJumps(int[] arr,int i){
        int j;
        int min = Integer.MAX_VALUE;
        if(i>=arr.length-1){
            return 0;
        }
        for(j=1;j<=arr[i];j++){
            int jumps = minJumps(arr, i+j);
            if((jumps+1)<min)
                min=jumps+1; 
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 3, 2, 6, 7};
        int n = minJumps(arr,0);
        System.out.println(n);
    }
}

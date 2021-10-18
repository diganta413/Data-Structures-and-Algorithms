public class Union {
    static int doUnion(int a[], int n, int b[], int m) 
    {
        int i=0,j=0;
        int ar[] = new int[n+m];
        int k=0;
        while(i<n && j<m){
            if(a[i] < b[j])
            {
                ar[k++] = a[i];
                i++;
            } 
            else if(a[i] > b[j])
            {
                ar[k++] = b[j];
                j++;
            }
            else{
                ar[k++] = a[i];
                i++;
                j++;
            } 
        }
        //System.out.println(j);
        //get remaining
        while(i<n)
        {
            ar[k++] = a[i];
            i++;
        }
        while(j<m)
        {
            ar[k++] = b[j];
            j++;
        }
        return k;
    }
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4};
        int b[] = new int[]{1,2,3,5};
        System.out.println(doUnion(a, 4, b, 4));

    }
}

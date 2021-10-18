class MaxMin{
    static class pair{
        int max;
        int min;
    }

    static pair maxmin(int[] ar,int low,int high){
        pair maxmin = new pair();
        
        //if no of element is 1
        if(high == low){
            maxmin.max = ar[low];
            maxmin.min = ar[low];
            return maxmin;
        }

        //if no of element is 2
        if(high == low+1){
            if(ar[high] >= ar[low]){
                maxmin.max = ar[high];
                maxmin.min = ar[low];
            }
            else{
                maxmin.min = ar[high];
                maxmin.max = ar[low]; 
            }
            return maxmin;
        }

        //if no of elements is greater than 2
        int mid = (high + low) / 2;
        pair m1 = new pair(); 
        pair m2 = new pair();
        m1 = maxmin(ar,low,mid);
        m2 = maxmin(ar,mid+1,high);

        //comapre at last
        if(m1.max >= m2.max)
        maxmin.max = m1.max;
        else
        maxmin.max = m2.max;
        
        if(m1.min <= m2.min)
        maxmin.min = m1.min;
        else
        maxmin.min = m2.min;
        return maxmin;
    }
    
    
    public static void main(String[] args) {
        int[] ar = new int[]{3,2,5,6};
        pair maxmin = new pair();
        maxmin = maxmin(ar, 0, ar.length-1);
        System.out.println(maxmin.max);
        System.out.println(maxmin.min);

    }
}
public class sum_of_digits {
    static int sum(int n){
        if(n/10==0)
            return n;
        else
            return n%10 + sum(n/10);
    }   
    public static void main(String[] args) {
        System.out.println(sum(4236));
    } 
}

class reverse{
    static String rev(String n){
        if(n.length()==1)
            return n;
        else
            return rev(n.substring(1, n.length())) + n.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(rev("123"));
    }
}
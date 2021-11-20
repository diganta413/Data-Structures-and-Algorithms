class WatterBottle{

    public static int numWaterBottles(int numBottles, int numExchange) {
        int k = numBottles;
        int extra = 0;
        //System.out.println("Hello");
        if(numExchange < numBottles){
            int diff = numBottles - numExchange;
            while(diff >= 0){
                k=k+1;
                extra = extra + 1;
                if(extra == numExchange)
                {
                    extra = 0;
                    k = k + 1;
                }
                System.out.println(diff);
                diff = diff-numExchange;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println(WatterBottle.numWaterBottles(15, 4));   
    }
}
package Array;

public class Stock {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        bestProfit(prices);
    }
    public static void bestProfit(int[] prices){
        int minPrice=prices[0];
        int maxPrice=0;
        int buyDay=0,sellDay=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
                buyDay=i+1;
            }
            if(prices[i]-minPrice>maxPrice){
                maxPrice=prices[i]-minPrice;
                sellDay=i+1;
            }
        }

        System.out.println("Buy on day "+buyDay+" at price "+minPrice);
        System.out.println("sell on day "+sellDay+" at price "+(maxPrice+minPrice));
        System.out.println("Maximum profit:"+maxPrice);
    }
}


public class BestTimetoBuyandSellStockII {
    static public int maxProfit(int[] prices) {
        int re = 0;
        int min = 0,max = 0;
        boolean flag = false;
        
        if(prices.length < 2) return 0;
        
        for(int i = 1;i < prices.length;i++){
        	if(!flag){
        		if(prices[i] < prices[min]) min = i;
        		else if(prices[i] > prices[min]) {
        			max = i;flag = true;
        		}
        	}else{
        		if((prices[i] < prices[max])){
        			re += prices[max] - prices[min];
        			min = i;flag = false;
        		}else max = i;
        	}
        }
        
        if(flag) re += prices[max] - prices[min];
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,2,3,4,5};
		System.out.println(maxProfit(prices));
	}

}

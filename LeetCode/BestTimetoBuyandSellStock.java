
public class BestTimetoBuyandSellStock {
    static public int maxProfit(int[] prices) {
        int re = 0;
        int min = 0,max = 0;
        boolean flag = false;
        
        if(prices.length < 2) return 0;
        
        for(int i = 1;i < prices.length;i++){
        	if(prices[i] < prices[min]){
        		if(flag && prices[max] - prices[min] > re) {
        			re = prices[max] - prices[min];
        			flag = false;
        		}
        		min = i;
        	}else if(!flag && prices[i] > prices[min]){
        		max = i;flag = true;
        	}
        	else if(flag && prices[i] > prices[max]) max = i;
        }
        
        if(flag && prices[max] - prices[min] > re)
			re = prices[max] - prices[min];
        
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		//int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}

}

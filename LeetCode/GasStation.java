import java.util.*;


public class GasStation {
    static public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int vol = 0,sum = 0;
        for(int i = 0;i < len;i++){
        	cost[i] = gas[i] - cost[i];
        	sum += cost[i];
        }
        if(sum < 0) return -1; 
        int index = 0;
        for(int i = 0;i < len;i++){
        	vol += cost[i];
        	if(vol < 0) {
        		index = i + 1;
        		vol = 0;
        	}
        }
        return index;          
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));
	}

}

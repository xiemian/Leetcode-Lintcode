import java.util.*;


public class Triangle {
    static public int minimumTotal(List<List<Integer>> triangle) {
        int[] ree = new int[triangle.get(triangle.size() - 1).size()];
        int re = Integer.MAX_VALUE;
        
        if(triangle.size() == 0) return 0;
        
        for(int i = 0;i < triangle.size();i++){
        	for(int j = triangle.get(i).size() - 1;j >= 0;j--){
        		if(i == 0) {
        			ree[j] = triangle.get(i).get(j);
        			continue;
        		}
        		if(j == 0) ree[j] = triangle.get(i).get(j) + ree[j];
        		else if(j == triangle.get(i).size() - 1) ree[j] = triangle.get(i).get(j) + ree[j - 1];
        		else {
        			System.out.print(triangle.get(i).get(j) + " " + ree[j - 1] + " " + ree[j] + " ");
        			ree[j] = triangle.get(i).get(j) + (ree[j - 1] < ree[j]?ree[j - 1]:ree[j]);
        			//System.out.print(ree[j] + " ");
        		}
        		//System.out.print(ree[j] + " ");
        	}
        	//System.out.println();
        }
        
        for(int i = 0;i < ree.length;i++){
        	if(re > ree[i]) re = ree[i];
        }
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		List<Integer> l4 = new ArrayList<Integer>();
		l1.add(2);l2.add(3);l2.add(4);l3.add(6);l3.add(5);l3.add(7);
		l4.add(4);l4.add(1);l4.add(8);l4.add(3);
		triangle.add(l1);triangle.add(l2);triangle.add(l3);triangle.add(l4);
		System.out.println(minimumTotal(triangle));
	}

}

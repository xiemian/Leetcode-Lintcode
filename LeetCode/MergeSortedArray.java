
public class MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(n == 0) return;
    	if(m == 0){
    		for(int i = 0;i < n;i++){
    			nums1[i] = nums2[i];
    		}
    		return;
    	}
    	
        for(int i = 0;i < m;i++)
        	nums1[m + n - 1 - i] = nums1[m - 1 - i];
        int index1 = n,index2 = 0;
        for(int i = 0;i < m + n;i++){
        	if(index2 == n){
        		nums1[i] = nums1[index1];
        		index1++;
        		continue;
        	}
        	if(index1 == m + n){
        		nums1[i] = nums2[index2];
        		index2++;
        		continue;
        	}
        	if(nums1[index1] > nums2[index2]) {
        		nums1[i] = nums2[index2];
        		index2++;
        	}else {
        		nums1[i] = nums1[index1];
        		index1++;
        	}
        	
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		int	m = 3,n = 3;
		merge(nums1, m, nums2, n);
		for(int i = 0;i < m + n;i++){
			System.out.print(nums1[i] + " ");
		}
	}

}

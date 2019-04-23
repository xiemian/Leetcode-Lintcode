
public class MedianOfTwoSortedArrays {
	
	static public double find(int[] m,int ml,int[] n,int nl,int k){
		for(int x = 0;x < ml;x++)
			System.out.print(m[x] + ",");
		System.out.println(" ");
		for(int x = 0;x <nl;x++)
			System.out.print(n[x] + ",");
		System.out.println(" ");
		if(ml < nl)
			return find(n,nl,m,ml,k);
		if(nl == 0)  {
			System.out.println("find it nl = 0    " + m[k - 1]);
			return m[k - 1];
		}
		if(k == 1) {
			System.out.println("find it k = 1    " + "m[0]=" + m[0] + "n[0]=" + n[0]);
			return Math.min(m[0],n[0]);
		}
		
		int pn = Math.min(nl, k / 2);
		int pm = k - pn;
		System.out.println("pm=" + pm + " pn=" + pn);
		System.out.println("m[pm - 1]=" + m[pm - 1] + " n[pn - 1]=" + n[pn - 1]);
		if(m[pm - 1] == n[pn - 1]) return m[pm - 1];
		else if(m[pm - 1] < n[pn - 1]) {
			System.out.println("m < n");
			return find(changeArray(m,pm),ml - pm,n,nl,k - pm);
		}
			
		else{
			System.out.println("m > n");
			return find(m,ml,changeArray(n,pn),nl - pn,k - pn);
		}
	}
	
	static public int[] changeArray(int[] a,int changeLength){
		int[] temp = new int[a.length - changeLength];
		for(int i = 0;i < (a.length - changeLength);i++){
			temp[i] = a[i + changeLength];
			System.out.print(temp[i] + "-");
		}
		System.out.println(" ");
		return temp;
	}
	
	
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ml = nums1.length;
        int nl = nums2.length;
        int total = ml + nl;
        double mid;
        
        if(total % 2 == 1)
        	mid = find(nums1,ml,nums2,nl,total / 2 + 1);
        else{
        	//System.out.println("aaa " + find(nums1,ml,nums2,nl,total / 2));
        	//System.out.println("bbb " + find(nums1,ml,nums2,nl,(total / 2 + 1)));
        	mid = (find(nums1,ml,nums2,nl,total / 2) + find(nums1,ml,nums2,nl,(total / 2 + 1))) / 2;
        }
        return mid;
    }
	
    public static void main(String[] args){
    	int[] m = {1,4,5,7};
    	int[] n = {0,2,3};
    	System.out.println(findMedianSortedArrays(m,n));
    }
}

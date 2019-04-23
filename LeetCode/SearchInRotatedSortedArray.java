
public class SearchInRotatedSortedArray {
    static public int search(int[] A, int target) {  
        int len = A.length;  
        if (len == 0) return -1;  
        return binarySearch(A, 0, len-1, target);  
    }  
      
    static public int binarySearch(int[] A, int left, int right, int target) {  
        if (left > right) return -1;  
          
        int mid = (left + right) / 2;  
        if (A[left] == target) return left;  
        if (A[mid] == target) return mid;  
        if (A[right] == target) return right;  
          
        //ͼʾ���һ  
        if (A[left] < A[right]) {   
            if (target < A[left] || target > A[right]) {    //target�������鷶Χ��  
                return -1;  
            } else if (target < A[mid]) {                   //target�����  
                return binarySearch(A, left+1, mid-1, target);  
            } else {                                        //target���ұ�  
                return binarySearch(A, mid+1, right-1, target);  
            }  
        }   
        //ͼʾ�����  
        else if (A[left] < A[mid]) {   
            if (target > A[left] && target < A[mid]) {      //target�����  
                return binarySearch(A, left+1, mid-1, target);  
            } else {                                        //target���ұ�  
                return binarySearch(A, mid+1, right-1, target);  
            }  
        }   
        //ͼʾ�����  
        else {   
            if (target > A[mid] && target < A[right]) {     //target���ұ�  
                return binarySearch(A, mid+1, right-1, target);  
            } else{                                         //target�����  
                return binarySearch(A, left+1, mid-1, target);  
            }  
        }  
    }  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		System.out.println(search(nums,6));
	}

}


public class EditDistance {
	 static public int minDistance(String word1, String word2) {
		 int l1 = word1.length();
		 int l2 = word2.length();
		 int[] matrix = new int[l2 + 1];
		 int cur = 0,prev = 0;
		 
		 for(int i = 0;i < l2 + 1;i++){
			 matrix[i] = i;
		 }
		 
		 for(int j = 1;j < l1 + 1;j++){
			 prev = j;
			 for(int i = 1;i < l2 + 1;i++){
				 if(word1.charAt(j - 1) == word2.charAt(i - 1))
					 cur = matrix[i - 1];
				 else 
					 cur = Math.min(Math.min(prev, matrix[i - 1]), matrix[i]) + 1;
				 matrix[i - 1] = prev;
				 prev = cur;
			 }
			 matrix[l2] = prev;
		 }
		 
		 return matrix[l2];
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1 = "sgrewa",s2 = "ggvegaaawa";
		String s1 = "cab",s2 = "abc";
		System.out.println(minDistance(s1,s2));
	}

}

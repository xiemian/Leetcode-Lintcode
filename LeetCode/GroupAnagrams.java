import java.util.*;

public class GroupAnagrams {
    static public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result = new ArrayList<List<String>>();
    	List<String> com = new ArrayList<String>();
    	
    	int len = strs.length;
    	
    	
    	for(int i = 0;i < len;i++){
    		char[] c = new char[26];
    		for(int j = 0;j < strs[i].length();j++){
    			c[strs[i].charAt(j) - 'a']++;
    		}
    		String ss = String.valueOf(c);
    		
    		if(com.contains(ss)){
    			int ind = com.indexOf(ss);
    			result.get(ind).add(strs[i]);
    		}else{
    			com.add(ss);
    			List<String> ll = new ArrayList<String>();
    			ll.add(strs[i]);
    			result.add(ll);
    		}
    	}
    	
    	return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		for(List<String> ll : groupAnagrams(strs)){
			System.out.println(ll);
		}
	}

}

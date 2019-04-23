import java.util.HashMap;


public class MinimumWindowSubstring {
    static public String minWindow(String s, String t) {
        int start = 0,minStart = 0,minLength = Integer.MAX_VALUE,count = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        if(t.length() > s.length()) return "";
        
        for(int i = 0;i < t.length();i++){
        	char c = t.charAt(i);
        	if(map.containsKey(c)){
        		map.put(c, map.get(c) + 1);
        	}else{
        		map.put(c, 1);
        	}
        }
        
        for(int i = 0;i < s.length();i++){
        	char c = s.charAt(i);
        	if(map.containsKey(c)){
        		map.put(c, map.get(c) - 1);
        		if(map.get(c) >= 0) count++;
        	};
        	
        	
        	while(count == t.length()){
        		char cc = s.charAt(start);
        		if(map.containsKey(cc)) {
        			map.put(cc,map.get(cc) + 1);
        			if(map.get(cc) > 0){
        				count--;
        				if(i - start < minLength) {
        					minLength = i - start + 1;
        					minStart = start;
        				}
                		
                		System.out.println(start + " " + i);
        			}
        		}
        		start++;
        	}
        	
        }
        
        if(minLength == Integer.MAX_VALUE) return "";
        else return s.substring(minStart, minStart + minLength);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "ADOBECODEBANC",t = "ABC";
		String s = "cabwefgewcwaefgcf",t = "cae";
		System.out.println(minWindow(s,t));
	}

}

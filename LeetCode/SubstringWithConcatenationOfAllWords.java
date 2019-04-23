import java.util.*;
public class SubstringWithConcatenationOfAllWords {
    static public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(String ss : words){
        	if(map.containsKey(ss)){
        		map.put(ss, map.get(ss) + 1);
        	}else{
        		map.put(ss, 1);
        	}
        }
        
        int ll = words[0].length();
        int ls = words.length;
     
        for(int i = 0;i <= s.length() - ls * ll;i++){
        	//System.out.println(i);
        	String sub = s.substring(i,i + ll);

        	int count = 0;
        	while(map.containsKey(sub) && map.get(sub) > 0){
        		map.put(sub, map.get(sub) - 1);
        		count++;
        		if(count == ls) {
        			result.add(i);
        			break;
        		}
        		sub = s.substring(i + count * ll,i + (count + 1) * ll);
        	}
        	
        	if(count > 0){
        		map.clear();
	            for(String ss : words){
	            	if(map.containsKey(ss)){
	            		map.put(ss, map.get(ss) + 1);
	            	}else{
	            		map.put(ss, 1);
	            	}
	            }
        	}
        }
        
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wordgoodgoodgoodbestwordhihellonihaowoodbest";
		String[] words =  {"word","good","best","good"};
		System.out.println(findSubstring(s,words));
	}

}

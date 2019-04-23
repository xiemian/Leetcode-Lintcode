import java.util.*;


public class WordLadder {
    static public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.size() == 0 || !wordList.contains(endWord))
        	return 0;
        Set<String> wordListt = new HashSet<String>(wordList);
        if(wordListt.contains(beginWord)) wordListt.remove(beginWord);
    	
    	int curnum = 1,level = 1,nextnum = 0;
        Queue<String> wordQueue = new LinkedList<String>();
        wordQueue.add(beginWord);
        
        while(!wordQueue.isEmpty()){
        	String word = wordQueue.poll();
        	curnum--;
        	//System.out.print(word + ",2");
        	
        	for(int i = 0;i < word.length();i++){
        		char[] wword = word.toCharArray();
        		for(char j = 'a';j <= 'z';j++){
        			wword[i] = j;
        			String tmp = new String(wword);
        			//System.out.print(tmp + ",");
        			if(wordListt.contains(tmp)){
        				//System.out.print(tmp + ",1");
        				if(tmp.equals(endWord)){
        					return level + 1;
        				}
        				wordQueue.add(tmp);
        				nextnum++;
        				wordListt.remove(tmp);
        			}
        		}
        	}
        	//System.out.println();
        	if(curnum == 0){
        		level++;
        		curnum = nextnum;
        		nextnum = 0;
        	}
        }
        
        //System.out.println("here");
        return 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = "hit",endWord = "cog";				
		List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
		System.out.println(ladderLength(beginWord,endWord,new ArrayList<String>(wordList)));
	}

}

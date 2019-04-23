import java.util.ArrayList;
import java.util.List;


public class TextJustification {
    
	static String oneLine(String[] words,int start,int end,int avi){
		String s,tmp = "";
		int spaceNum = 0,x = 0,y = 0;
		
		s = words[start];
		spaceNum = end - start;
		
		if(spaceNum != 0){
			x = avi / spaceNum;
			y = avi % spaceNum;
			
			
			for(int i = start + 1;i <= end;i++){
				tmp = " ";
				for(int j = 0;j < x;j++){
					tmp += " ";
				}
				if(i - start <= y) tmp += " ";
				s += tmp;
				s += words[i];
			}
		}else{
			for(int j = 0;j < avi;j++){
				tmp += " ";
			}
			s += tmp;
		}
		return s;
	}
	
	static public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> result = new ArrayList<String>();

		int start = 0,len = words[0].length(),index = 1,ll = 0,avi = 0;
		if(words.length == 0){
			String tmp = "";
			for(int j = 0;j < maxWidth;j++){
				tmp += " ";
			}
			result.add(tmp);
			return result;
		}else if (words.length == 1){
			String tmp = words[0];
			for(int j = 0;j < maxWidth - words[0].length();j++){
				tmp += " ";
			}
			result.add(tmp);
			return result;
		}
		
		
        while(index < words.length){
        	ll = words[index].length();
        	len += ll + 1;
        	if(len > maxWidth){
        		avi = maxWidth - len + ll + 1;
        		len = ll;
        		result.add(oneLine(words,start,index - 1,avi));
        		start = index;        		
        	}
        	index++;
        }
        
        //ÃÌº” £”‡String
        String tmp = words[start];
        for(int i = start + 1;i < words.length;i++)
        	tmp += " " + words[i];
       
        for(int i = 0;i < maxWidth - len;i++){
        	tmp += " ";
        }
        result.add(tmp);
        
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = //{"This", "is", "an", "example", "of", "text", "justification."};
			{"What","must","be","shall","be."};
						
		int len = 12;
		List<String> re = fullJustify(s,len);
		while(!re.isEmpty()) System.out.println(re.remove(0));
	}

}

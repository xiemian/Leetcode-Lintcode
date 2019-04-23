import java.util.*;

public class RestoreIPAddresses {
	static void calcuate(List<String> re,int[] split,String s,int index){
		if(index == 5){
			int ssLen = split[4];
			if(s.length() == ssLen){	
				re.add(s.substring(split[0],split[1])
						+ '.' + s.substring(split[1], split[2])
						+ '.' + s.substring(split[2], split[3])
						+ '.' + s.substring(split[3]));

			}
			return;
		}
		
		for(int i = 0;i < 3;i++){
			split[index] = i + 1 + split[index - 1];
			if(split[index] > s.length()) break;
			System.out.println(s.substring(split[index - 1], split[index]));
			if(Integer.valueOf(s.substring(split[index - 1], split[index])) < 256){
				calcuate(re,split,s,index + 1);
			}
			if(i == 0 && s.substring(split[index - 1], split[index]).equals("0")) {
				System.out.println("0 " + split[index - 1] +" " + split[index]);
				break;
			}
	
		}
		
	}
	
    static public List<String> restoreIpAddresses(String s) {
        List<String> re = new ArrayList<String>();
    	int len = s.length();
    	if(len < 4 || len > 12) return re;
    	int[] split = new int[5];
    	
    	calcuate(re,split,s,1);
    	
    	return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "25525511135";
		//String s = "010010";
		//System.out.println(s.substring(3, 5));
		
		for(String ss : restoreIpAddresses(s)){
			System.out.println(ss);
		}
	}

}

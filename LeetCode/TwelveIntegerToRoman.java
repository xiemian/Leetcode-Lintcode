
public class TwelveIntegerToRoman {

    static public String intToRoman(int num) {
        String[][] roman = {  
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
                {"", "M", "MM", "MMM"}  
            };
        String result = "";
        int index = 0;
        if(num < 1 || num > 3999) return "Error Input: " + num;
        
        while(num > 0){
        	int digit = num % 10;
        	result = roman[index][digit] + result;
        	num = num / 10;
        	index++;
        }

        return result;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3211;
		System.out.println(intToRoman(num));
	}

}

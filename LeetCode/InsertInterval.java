import java.util.ArrayList;
import java.util.List;




public class InsertInterval {
	
	static public class Interval {
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	}
	
    static public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<Interval>();  
        if(intervals.size()==0)  
        {  
            res.add(newInterval);  
            return res;  
        }  
        int i=0;  
        while(i<intervals.size() && intervals.get(i).end<newInterval.start)  
        {  
            res.add(intervals.get(i));  
            i++;  
        }  
        if(i<intervals.size())  
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);  
        res.add(newInterval);  
        while(i<intervals.size() && intervals.get(i).start<=newInterval.end)  
        {  
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);  
            i++;  
        }  
        while(i<intervals.size())  
        {  
            res.add(intervals.get(i));  
            i++;  
        }  
        return res;  
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval a1 = new Interval(1,2); 
		Interval a2 = new Interval(3,5); 
		Interval a3 = new Interval(6,7); 
		Interval a4 = new Interval(8,10); 
		Interval a5 = new Interval(12,16); 
		
		Interval m = new Interval(4,9); 
		
		List<Interval> intervals = new ArrayList<Interval>();
		
		intervals.add(a1);
		intervals.add(a2);
		intervals.add(a3);
		intervals.add(a4);
		intervals.add(a5);
		
		for(Interval tmp : insert(intervals,m)){
			System.out.println(tmp.start + " " + tmp.end);
		}
	}

}

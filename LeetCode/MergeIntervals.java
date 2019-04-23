import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;



public class MergeIntervals {
	/**
	 * Definition for an interval.*/
	static public class Interval {
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	}
	 
    static public class MyComparator implements Comparator<Interval> {  
        @Override  
        public int compare(Interval a, Interval b) {  
            return a.start - b.start;  
        }  
    }  
	static public List<Interval> merge(List<Interval> intervals) {

		List<Interval> results = new ArrayList<Interval>();
		if(intervals.size() == 0) return results;
		
		Collections.sort(intervals, new MyComparator());
		
		Stack<Integer> temp = new Stack<Integer>();
		
		Interval tt = intervals.remove(0);
		temp.push(tt.start);
		temp.push(tt.end);
		
		for(Interval tmp : intervals){			
			if(tmp.start <= temp.peek()){
				if(tmp.end > temp.peek()){
					temp.pop();
					temp.push(tmp.end);
				}
			}else{
				temp.push(tmp.start);
				temp.push(tmp.end);
			}
		}
		
		while(!temp.empty()){
			int end = temp.pop();
			int start = temp.pop();
			results.add(new Interval(start,end));
		}
		
		return results;
	        
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval a1 = new Interval(1,3); 
		Interval a2 = new Interval(2,6); 
		Interval a3 = new Interval(8,10); 
		Interval a4 = new Interval(15,18); 
		
		List<Interval> intervals = new ArrayList<Interval>();
		
		intervals.add(a1);
		intervals.add(a2);
		intervals.add(a3);
		intervals.add(a4);
		
		for(Interval tmp : merge(intervals)){
			System.out.println(tmp.start + " " + tmp.end);
		}
	}

}

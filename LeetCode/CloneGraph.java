import java.util.*;


public class CloneGraph {

	 static class UndirectedGraphNode {
		     int label;
		     List<UndirectedGraphNode> neighbors;
		     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
		 };
	
	static UndirectedGraphNode clone(UndirectedGraphNode node,HashMap<Integer,UndirectedGraphNode> map){
		if(node == null) return node;
		if(map.containsKey(node.label)) return map.get(node.label);
		
		UndirectedGraphNode tmp = new UndirectedGraphNode(node.label);
		System.out.println(node.label + "was established!");
		map.put(node.label, tmp);
		for(UndirectedGraphNode nn : node.neighbors){
			tmp.neighbors.add(clone(nn,map));
		}
		return tmp;
	}
		 
	static public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<Integer,UndirectedGraphNode> map = new HashMap<Integer,UndirectedGraphNode>();
        System.out.println(clone(node,map).label + "is head");
        return clone(node,map);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndirectedGraphNode node0 = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		
		node0.neighbors.add(node1);
		node0.neighbors.add(node2);
		node1.neighbors.add(node0);
		node1.neighbors.add(node2);
		node2.neighbors.add(node0);
		node2.neighbors.add(node1);
		node2.neighbors.add(node2);
		
		cloneGraph(node1);
		
	}

}

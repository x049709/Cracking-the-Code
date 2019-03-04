package Q4_01_Route_Between_Nodes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QuestionC {
	public enum State {
		Unvisited, Visited, Visiting;
	} 

	public static void visit(NodeC node) {
		if (node != null) {
			System.out.println("visiting: " + node.getVertex());
		}
	}

	public static void main(String a[])
	{
		GraphC g = createNewGraph();
		NodeC[] n = g.getNodes();
		NodeC start = n[3];
		NodeC end = n[5];
		System.out.println(g.toString());
		//System.out.println("Using LinkedList from: " + start.toString() + " to: " + end.toString());
		//System.out.println(search(g, start, end));
		System.out.println("Using Deque from: " + start.toString() + " to: " + end.toString());
		System.out.println(dequeSearch(g, start, end));
		System.out.println(g.toString());
	}

	public static GraphC createNewGraph()
	{
		GraphC g = new GraphC();        
		NodeC[] temp = new NodeC[6];

		temp[0] = new NodeC("Anchorage", 3);
		temp[1] = new NodeC("Berlin", 0);
		temp[2] = new NodeC("Canton", 0);
		temp[3] = new NodeC("Des Moines", 1);
		temp[4] = new NodeC("Edmonton", 1);
		temp[5] = new NodeC("Fairfield", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		return g;
	}

	static boolean search(GraphC g,NodeC start,NodeC end) {  
		LinkedList<NodeC> q = new LinkedList<NodeC>();
		for (NodeC u : g.getNodes()) {
			u.state = State.Unvisited;
		}
		start.state = State.Visited;
		q.add(start);
		NodeC u;
		while(!q.isEmpty()) {
			u = q.removeFirst();
			visit(u);
			if (u != null) {
				for (NodeC v : u.getAdjacent()) {
					if (v.state == State.Unvisited) {
						if (v == end) {
							return true;
						} else {
							v.state = State.Visited;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}
		return false;
	}

	static boolean dequeSearch(GraphC g,NodeC start,NodeC end) { 
		Deque<NodeC> dq = new ArrayDeque<NodeC>();
		for (NodeC node : g.getNodes()) {
			node.state = State.Unvisited;
		}
		start.state = State.Visited;
		dq.offerLast(start);

		NodeC node;
		while (!dq.isEmpty()) {
			node = dq.pop();
			visit(node);
			for (NodeC n: node.getAdjacent()) {
				if (n.state == State.Unvisited) {
					if (n == end) {
						return true;
					} else {
						n.state = State.Visited;
						dq.offerLast(n);    				   
					}
				}
			}    	   
		}
		return false;


	}
}

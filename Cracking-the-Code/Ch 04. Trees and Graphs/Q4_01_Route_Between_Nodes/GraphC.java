package Q4_01_Route_Between_Nodes;

public class GraphC {
	public static int MAX_VERTICES = 6;
	private NodeC vertices[];
	public int count;
	public GraphC() {
		vertices = new NodeC[MAX_VERTICES];
		count = 0;
    }
	
    public void addNode(NodeC x) {
		if (count < vertices.length) {
			vertices[count] = x;
			count++;
		} else {
			System.out.print("Graph full");
		}
    }
    
    public NodeC[] getNodes() {
        return vertices;
    }
    
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	for (int i=0;i<vertices.length;i++) {
    		sb= sb.append(vertices[i].toString() + "\n");
    	}
    	return sb.toString();   	
    }

}


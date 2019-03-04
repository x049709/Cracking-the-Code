package Q4_01_Route_Between_Nodes;

class NodeC {
    private NodeC adjacent[];
    public int adjacentCount;
    private String vertex;
    public QuestionC.State state;
    public NodeC(String vertex, int adjacentLength) {
        this.vertex = vertex;                
        adjacentCount = 0;        
        adjacent = new NodeC[adjacentLength];
    }
    
    public void addAdjacent(NodeC x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }
    public NodeC[] getAdjacent() {
        return adjacent;
    }
    public String getVertex() {
        return vertex;
    }
    
    public String toString() {
		String vxst = vertex + (state == null ? "" : ":" + state);
    	StringBuilder sb=new StringBuilder();
    	for (int i=0;i<adjacent.length;i++) {
    		String st = adjacent[i].state == null ? "" : ":" + adjacent[i].state.toString();
    		sb= sb.append(adjacent[i].vertex +  st  + ",");
    	}
    	String x = sb.toString();
    	if (x.length()>0) x=x.substring(0,x.length()-1);
    	return vxst + ":" + x;   	
    }
}

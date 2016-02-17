package study.datastructure.graph;

public interface Graph {
	public int vertexCnt = 0;
	
	public void initGraph (int vertexCnt);
	public boolean isEmpty ();
	public void insertVertex (int v);
	public void insertEdge (int v, int u);
	public void deleteVertex (int v);
	public void deleteEdge (int v, int u);
	public void adjacent (int v);
	
	public void initForTraversal();
	public void depthFirstSearch (int v);
	public void breadthFirstSearch (int v);
}

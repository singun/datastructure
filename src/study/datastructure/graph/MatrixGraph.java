package study.datastructure.graph;

public class MatrixGraph implements Graph{
	final static int MAX_VERTEX_CNT = 30;
	public int adjMatrix[][];
	public int vertexCnt = 0;
	
	public MatrixGraph () {
		this.adjMatrix = new int[MAX_VERTEX_CNT][MAX_VERTEX_CNT];
	}
	
	public void initGraph (int vertexCnt) {
		for (int i = 0; i < vertexCnt; i++) {
			for (int j = 0; j < vertexCnt; j++) {
				this.adjMatrix[i][j] = 0;
			}
		}
		this.vertexCnt = vertexCnt;
	}
	
	public boolean isEmpty () {
		if (vertexCnt == 0) return true;
		return false;
	}
	
	public void insertVertex (int v) {
		this.vertexCnt++;
	}
	
	public void insertEdge (int v, int u) {
		this.adjMatrix[v][u] = 1;
	}
	
	public void deleteVertex (int v) {
		this.vertexCnt--;
	}
	
	public void deleteEdge (int v, int u) {
		this.adjMatrix[v][u] = 0;
	}
	
	public void adjacent (int v) {
		for (int i = 0; i < this.vertexCnt; i++) {
			if (this.adjMatrix[v][i] == 1) System.out.println(i);
		}
	}
	
	public void initForTraversal () {
		
	}
	
	public void depthFirstSearch (int v) {
		
	}
	
	public void breadthFirstSearch (int v) {
		
	}
}

//adjacent(v)
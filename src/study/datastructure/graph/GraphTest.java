package study.datastructure.graph;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g1 = new ListGraph();
		g1.initGraph(7);
		
		for (int i = 0; i < 7; i++)
			g1.insertVertex(i);
		
//		g1.insertEdge(0,1);
//		g1.insertEdge(1,0);
//		g1.insertEdge(0,3);
//		g1.insertEdge(3,0);
//		g1.insertEdge(1,3);
//		g1.insertEdge(3,1);
//		g1.insertEdge(2,3);
//		g1.insertEdge(3,2);
//		g1.insertEdge(1,2);
//		g1.insertEdge(2,1);
		
//		g1.adjacent(3);
		
		g1.insertEdge(0,2);
		g1.insertEdge(0,1);
		g1.insertEdge(1,4);
		g1.insertEdge(1,3);
		g1.insertEdge(1,0);
		g1.insertEdge(2,4);
		g1.insertEdge(2,0);
		g1.insertEdge(3,6);
		g1.insertEdge(3,1);
		g1.insertEdge(4,6);
		g1.insertEdge(4,2);
		g1.insertEdge(4,1);
		g1.insertEdge(5,6);
		g1.insertEdge(6,5);
		g1.insertEdge(6,4);
		g1.insertEdge(6,3);
		
		g1.initForTraversal();
		g1.breadthFirstSearch(0);
	}
}

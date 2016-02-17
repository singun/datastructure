package study.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ListGraph implements Graph {
	public int vertexCnt = 0;
	
	@SuppressWarnings("rawtypes")
	public List adjList[];
	
	// travers를 위해 필요한 것들
	// stack과 queue는 직접 구현해보기
	public Stack<Integer> stk;
	public Queue<Integer> que;
	public int isVisited[];
	
	@Override
	public void initGraph(int vertexCnt) {
		this.adjList = new List[vertexCnt];
	}

	@Override
	public boolean isEmpty() {
		if (this.vertexCnt == 0) return true;
		return false;
	}

	@Override
	public void insertVertex(int v) {
		this.vertexCnt++;
		if (this.adjList[v] == null) this.adjList[v] = new ArrayList<>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void insertEdge(int v, int u) {
		this.adjList[v].add(u);
	}

	@Override
	public void deleteVertex(int v) {

	}

	@Override
	public void deleteEdge(int v, int u) {

	}

	@Override
	public void adjacent(int v) {
		for (int i = 0; i < this.adjList[v].size(); i++) {
			System.out.println(this.adjList[v].get(i));
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initForTraversal() {
		this.stk = new Stack<>();
		this.que = new LinkedList();
		this.isVisited = new int[this.vertexCnt];
		
		for (int i = 0; i < this.vertexCnt; i++) {
			this.adjList[i].sort(null);
		}
	}
	
	/**
	 * 깊이 우선 탐색 Depth First Search (DFS)
	 */
	public void depthFirstSearch (int v) {
		this.isVisited[v] = 1;
		int adjCnt = this.adjList[v].size();
		System.out.println((char) (v+65));
		
		if (adjCnt > 0) {
			stk.push(v);
			
			for (int i = 0; i < adjCnt; i++) {
				int vertex = (int)this.adjList[v].get(i);
				if (this.isVisited[vertex] == 0)
					depthFirstSearch((int)this.adjList[v].get(i));
			}
		} else {
			depthFirstSearch(stk.pop());
		}
	}
	
	/**
	 * 너비 우선 탐색, Breadth First Search (BFS)
	 */
	public void breadthFirstSearch (int v) {
		this.isVisited[v] = 1;
		int adjCnt = this.adjList[v].size();
		System.out.println((char) (v+65));
				
		for (int i = 0; i < adjCnt; i++){
			int adjVtx = (int) this.adjList[v].get(i);
			if(this.isVisited[adjVtx] == 0)
				que.add((int)this.adjList[v].get(i));
		}
		
		if (que.isEmpty())
			return;
		
		int vertex = (int)que.remove();
		if (this.isVisited[vertex] == 0)
			breadthFirstSearch(vertex);
		else
			breadthFirstSearch((int)que.remove());
	}

}

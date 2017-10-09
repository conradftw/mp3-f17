package ca.ubc.ece.cpen221.mp3.graph;
import java.util.List;
import java.io.File;
import java.util.ArrayList;

import ca.ubc.ece.cpen221.mp3.staff.Graph;

public class AdjacencyMatrixGraph implements Graph {
// TODO: Implement this class
	//store all vertice names in a list for reference
	File file;
	private List<String> vertexList;// = new ArrayList<String>();
	private int[][] adjMatrix;
	
	public AdjacencyMatrixGraph(File file) {
		this.file = file;
		this.vertexList = vertexList;
		this.adjMatrix = adjMatrix;
	}
	
	public void addVertex(Vertex v) {
		
	}
}

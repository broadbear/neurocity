package org.mike.neurocity;

import java.util.Map;
import org.mike.graph.Graph;

public class Network {

	int nodeCount;
	Graph graph;
	Map<Integer, Node> nodeMap;
	
	public void addNode(Node n) {
		nodeMap.put(nodeCount - 1, n);
		nodeCount++;
	}
	
}

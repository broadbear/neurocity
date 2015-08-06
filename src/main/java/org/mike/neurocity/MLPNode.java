package org.mike.neurocity;

public class MLPNode implements Node {

	Function weightedSum;
	Function activationFunction;
	double biasTerm;
	
	public MLPNode() {
		
		activationFunction = new LogisticFunction();
		
	}
	
}

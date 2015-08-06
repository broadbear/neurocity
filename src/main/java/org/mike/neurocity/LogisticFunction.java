package org.mike.neurocity;

public class LogisticFunction implements Function {

	@Override
	public double eval(double x) {
		double denom = 1 + Math.exp(-x);
		double res = 1 / denom;
		return res;
	}

}

package org.mike.neurocity;

public class HyperbolicTangentFunction implements Function {

	@Override
	public double eval(double x) {
		double res = Math.tanh(x / 2);
		return res;
	}

}

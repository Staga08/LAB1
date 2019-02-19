package model;

public class NewtonsMethod {

		NewtonsMethod(){
		
	}
		
	public double solveRoots(double[] a, double x, double s){
		HornersMethod h=new HornersMethod(a);
		double f=1, d;
		while(f>s){
			h.evaluate(x);
			f = h.val();
			d = h.der();
			x = x - f/d;
		}
		return x;
	}
		
}



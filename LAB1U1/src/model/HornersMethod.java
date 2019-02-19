package model;

public class HornersMethod {
	
	int n;
	double a[],y,z;
		
	HornersMethod(double[] a1){
		n = a1.length;
		a = a1;
	}
	public double val(){
		return y;
	}
		
	public double der(){
		return z;
	}
		
	public void evaluate(double x0){
		y = a[n-1];
		z = a[n-1];
		for(int j = n-2; j>0; j--){
			y = x0*y + a[j];
			z = x0*z + y;
		}
		y = x0*y + a[0];
	}
}



package model;

public class QuadraticFormula {
	
	public QuadraticFormula() {
		
	}

	public double discriminant(int a,int b,int c) {
		
		double dis=Math.sqrt(Math.pow(b,2)-(4*(a*c)));
		return dis;
		
	}
	

	public String solve(int z[]) {
		int a=z[0];
		int b=z[1];
		int c=z[2];
		
		double dis= discriminant(a,b,c);
		
		double  x1=0.0;
		double  x2=0.0;
		
		String roots="";
		
		if(dis>0) {
			 x1=(-b+dis)/(2*a);
			 x2=(-b -dis)/(2*a);
			 roots= x1 +","+ x2;
			 
		}else if(dis==0) {
			x1=-b/(2*a);
			roots= ""+x1;
		}else {
			roots= "El polinomio tiene raices imaginarias";
		}
		return roots;
	}

}

package model;

public class Polynomial {
	private BairstowMethod bairstows;
	private QuadraticFormula quadratics= new QuadraticFormula();
	private NewtonsMethod newtons;
	private int grade;
	private int[] constants;
	
	
	public Polynomial(int[] constants) {
		this.constants=constants;
		grade=constants.length-1;
	}
	


	public Polynomial(double[] doubleConstant) {
		// TODO Auto-generated constructor stub
	}



	public QuadraticFormula getQuadratic() {
		return quadratics;
	}
	
	public void setQuadratic(QuadraticFormula quadratics) {
		this.quadratics=quadratics;
	}
	public NewtonsMethod getNewtons() {
		return newtons;
	}

	public void setNewtons(NewtonsMethod newtons) {
		this.newtons = newtons;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int[] getConstants() {
		return constants;
	}

	public void setConstants(int[] constants) {
		this.constants = constants;
	}



	public BairstowMethod getBairstows() {
		return bairstows;
	}



	public void setBairstows(BairstowMethod bairstows) {
		this.bairstows = bairstows;
	}

}

package application;

import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

	@FXML private TextField input;
	@FXML private TextField autoGenerate;
	@FXML private Label xValue;
	@FXML private Button solve;
	@FXML private Button autoGenerateB;
	
	
	
	private static Main main;
	
	public void initialize() {
		
	}
	
	/**
	 * this method solve the problem, it call method in the model
	 */
//	public  void solve() {
//		double[] solution = main.foundRoots(input.getText());
//		DecimalFormat df = new DecimalFormat("(#0.00)");
//		String roots = "";
//		for (int i = 1; i < solution.length; i++) {
//			roots += df.format(solution[i])+""+'\t'+" ";
//		}
//		roots.substring(0, 1);
//		xValue.setText(roots);
//	}
	
	/**
	 * this method generate a polynomial with grade n and n values
	 */
	public void generateQuadratics() {
		String random = Main.generateQ();
		
		xValue.setText(random);
		autoGenerate.setText(Main.getA()+"x^2 +" + Main.getB()+"x +"+ Main.getC() );
		
	}
	
	public  void solve() {
		double[] solution = main.foundRoots(input.getText());
		DecimalFormat df = new DecimalFormat("(#0.00)");
		String roots = "";
		for (int i = 1; i < solution.length; i++) {
			roots += df.format(solution[i])+""+'\t'+" ";
		}
		roots.substring(0, 1);
		xValue.setText(roots);
	}
	
}

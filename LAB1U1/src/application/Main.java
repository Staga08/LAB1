package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.BairstowMethod;
import model.Polynomial;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	static int a;
	static int b;
	static int c;
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static String generateQ() {
		int n = 3;
		int[] random = new int[n];
		for(int i=random.length-1; i>=0;i--) {
			random[i] = (int) ((Math.random()*50) + 1);
		
		}
		a=random[0];
		b=random[1];
		c=random[2];
		
		Polynomial p1 = new Polynomial(random);
		System.out.println(random.length);
		String roots = p1.getQuadratic().solve(random);
		return roots;
		}
	
	public static double[] foundRoots(String input) {
		String b = " "+input;
		char control = '^';
		char[] numbers = b.toCharArray();
		String n = "";
		
		for (int j = 0; j < numbers.length; j++) {
			if(Character.isDigit(numbers[j])) {
				if(numbers[j-1]!=control) 
					n+=numbers[j]+" ";
				else {
					if(numbers[j-1]=='-') {
						n+= "-"+numbers[j];
					}
				}
			}
		}
		
		String [] stringConstant = n.split(" ");
		
		double[] doubleConstant = new double[stringConstant.length];
		for(int i=doubleConstant.length-1;i>=0;i--) {
			doubleConstant[i] = Double.parseDouble(stringConstant[doubleConstant.length-1-i]);
		}
		Polynomial p1 = new Polynomial(doubleConstant);
		double[] roots = p1.getBairstows().Bairstow(doubleConstant);

		return roots;
	}

	public static int getA() {
		return a;
	}

	public static int getB() {
		return b;
	}

	public static int getC() {
		return c;
	}
	
	
	
}

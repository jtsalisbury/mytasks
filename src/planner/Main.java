package planner;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//SQLManager db = new SQLManager();
		UserManager user = new UserManager(primaryStage);
		
		user.promptLogin();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
